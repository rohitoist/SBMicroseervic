package com.lcwd.gateway;

import java.util.Collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {

	private String userId;
	private String accesstoken;
	private String refreshtoken;
	private long expireAt;
	private Collection<String> authority;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAccesstoken() {
		return accesstoken;
	}
	public void setAccesstoken(String accesstoken) {
		this.accesstoken = accesstoken;
	}
	public String getRefreshtoken() {
		return refreshtoken;
	}
	public void setRefreshtoken(String refreshtoken) {
		this.refreshtoken = refreshtoken;
	}
	public long getExpireAt() {
		return expireAt;
	}
	public void setExpireAt(long expireAt) {
		this.expireAt = expireAt;
	}
	public Collection<String> getAuthority() {
		return authority;
	}
	public void setAuthority(Collection<String> authority) {
		this.authority = authority;
	}
}
