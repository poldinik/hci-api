package com.cosmink.services.security.authenticationToken;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AuthenticationToken {

    private String token;

    private AuthenticationTokenDetails authenticationTokenDetails;

    public AuthenticationTokenDetails getAuthenticationTokenDetails() {
        return authenticationTokenDetails;
    }

    public void setAuthenticationTokenDetails(AuthenticationTokenDetails authenticationTokenDetails) {
        this.authenticationTokenDetails = authenticationTokenDetails;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
