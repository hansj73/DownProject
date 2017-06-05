package com.prj.Culture.security.dto;


import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.prj.Culture.security.model.Role;

public class UserDTO implements UserDetails {
	
    private static final long serialVersionUID = 1L; 
    private String username; 
    private String password; // 추가적인 회원정보 항목을 추가한다. email 이나 연락처 등등... 
    private List<Role> authorities; 
    private boolean accountNonExpired = true; 
    private boolean accountNonLocked = true; 
    private boolean credentialsNonExpired = true; 
    private boolean enabled = true;
    
    /** 추가**/
    private String user_id="";
    private String email="";

    @Override 
    public String getUsername() { 
    return username; 
    } 
    public void setUsername(String username) { 
    this.username = username; 
    } 
    @Override 
    public String getPassword() { 
    return password; 
    } 
    public void setPassword(String password) { 
    this.password = password; 
    } 
    @Override 
    public Collection<? extends GrantedAuthority> getAuthorities() { 
    return this.authorities; 
    } 
    public void setAuthorities(List<Role> authorities) { 
    this.authorities = authorities; 
    } 
    @Override 
    public boolean isAccountNonExpired() { 
    return this.accountNonExpired; 
    } 
    public void setAccountNonExpired(boolean accountNonExpired) { 
    this.accountNonExpired = accountNonExpired; 
    } 
    @Override 
    public boolean isAccountNonLocked() { 
    return this.accountNonLocked; 
    } 
    public void setAccountNonLocked(boolean accountNonLocked) { 
    this.accountNonLocked = accountNonLocked; 
    } 
    @Override 
    public boolean isCredentialsNonExpired() { 
    return this.credentialsNonExpired; 
    } 
    public void setCredentialsNonExpired(boolean credentialsNonExpired) { 
    this.credentialsNonExpired = credentialsNonExpired;
    } 
    @Override public boolean isEnabled() { 
    return this.enabled; 
    } 
    public void setEnabled(boolean enabled) { 
    this.enabled = enabled; 
    }
    
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}



}