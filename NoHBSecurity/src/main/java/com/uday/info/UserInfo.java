package com.uday.info;

import java.util.ArrayList;
import java.util.Collection;

//import org.springframework.security.core.GrantedAuthority;

public class UserInfo {
	
	private String userCode;
	
	private String password;
	
	//private Collection<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * public Collection<GrantedAuthority> getGrantedAuthorities() { return
	 * grantedAuthorities; }
	 * 
	 * public void setGrantedAuthorities(Collection<GrantedAuthority>
	 * grantedAuthorities) { this.grantedAuthorities = grantedAuthorities; }
	 */

}
