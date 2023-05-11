package com.lcwd.UserService.UserService.Controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lcwd.UserService.UserService.external.service.HotelService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping("/users")
@Component
public class UserServiceController {

	String getHotelServiceName = "";
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private HotelService hotelService;
	private Logger logger = org.slf4j.LoggerFactory.getLogger(UserServiceController.class);

	@GetMapping("/")
	public String getServiceName() {

		return "User Service ";
	}

	@GetMapping("/getHotelServiceName")
	@CircuitBreaker(name = "hotelServiceBreaker", fallbackMethod = "callingHotelServiceFallback")
	public String callingHotelService() {
		// here http://HOTEL-SERVICE/hotels/ is load balanved url configured under
		// apigateway
		
		// calling hotel microservice from user service using rest template
		//getHotelServiceName = restTemplate.getForObject("http://HOTEL-SERVICE/hotels/", String.class);
		
		//calling hotel microservice from user service using fiegn clint service template
		getHotelServiceName = hotelService.getServiceName();
		
		logger.info(getHotelServiceName);
		return getHotelServiceName;
	}

	public String callingHotelServiceFallback(Exception e) {
		// calling hotel microservice from user service
		// getHotelServiceName =
		// restTemplate.getForObject("http://localhost:8083/hotels/", String.class);
		e.printStackTrace();
		logger.info("callingHotelServiceFallback called becasue hotel service is down" + e.getMessage());
		return "fallback method response!!!";
	}

	// below is example of retry when hotel service is down below will retry 3 time
	// but if not get any rsponse from hotel service then call fallback method,
	// retry config in application.yml userservice project
	// https://resilience4j.readme.io/docs/retry
	int retryCount = 1;

	@GetMapping("/getHotelServiceNameRetryExample")
	@Retry(name = "hotelServiceBreakerRetry", fallbackMethod = "callingHotelServiceFallback")
	public String examplRetryeHotelService() {
		logger.info("" + retryCount++);
		// calling hotel microservice from user service
		getHotelServiceName = restTemplate.getForObject("http://HOTEL-SERVICE/hotels/", String.class);
		logger.info(getHotelServiceName);
		return getHotelServiceName;
	}

	// below is example of Ratelimiter when hotel service is down below will retry 3
	// time
	// but if not get any response from hotel service then call fallback method,
	// rateLimiter config in application.yml userservice project use apache jmeter
	// to test this jmeter is at C:\Users\User\Desktop\cloud\apache-jmeter-5.5\bin
	// just run jmeter.bat
	// https://resilience4j.readme.io/docs/retry

	@GetMapping("/getHotelServiceNameRatelimiter")
	@RateLimiter(name = "hotelServiceBreakerRateLimiter", fallbackMethod = "callingHotelServiceFallback")
	public String examplRateLimitereHotelService() {
		logger.info("" + retryCount++);
		// calling hotel microservice from user service
		getHotelServiceName = restTemplate.getForObject("http://HOTEL-SERVICE/hotels/", String.class);
		logger.info(getHotelServiceName);
		return getHotelServiceName;
	}
}
