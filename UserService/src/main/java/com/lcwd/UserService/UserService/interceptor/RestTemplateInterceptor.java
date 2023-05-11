package com.lcwd.UserService.UserService.interceptor;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.security.oauth2.client.AuthorizedClientServiceOAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.OAuth2AuthorizeRequest;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.stereotype.Component;

@Configuration
public class RestTemplateInterceptor implements ClientHttpRequestInterceptor {
	
	@Autowired
	public OAuth2AuthorizedClientManager manager;
	
	@Autowired
	private AuthorizedClientServiceOAuth2AuthorizedClientManager auth2AuthorizedClientManager;

	public RestTemplateInterceptor(AuthorizedClientServiceOAuth2AuthorizedClientManager auth2AuthorizedClientManager) {
		this.auth2AuthorizedClientManager = auth2AuthorizedClientManager;
	}



	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
			throws IOException {
		String token = auth2AuthorizedClientManager.authorize(
				OAuth2AuthorizeRequest.withClientRegistrationId("my-internal-client").principal("internal").build()).getAccessToken().getTokenValue();
		request.getHeaders().add("Authorization", "Bearer " + token);
		
		return execution.execute(request, body);
	}

}
