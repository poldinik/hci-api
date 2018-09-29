package com.cosmink.filters;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
public class CORSFilter implements ContainerResponseFilter {

    @Override
    public void filter(final ContainerRequestContext requestContext,
                       final ContainerResponseContext crc) throws IOException {
        crc.getHeaders().add("Access-Control-Allow-Origin", "*");
        crc.getHeaders().add("Access-Control-Allow-Headers", "origin, content-type, accept, authorization");
        crc.getHeaders().add("Access-Control-Allow-Credentials", "true");
        crc.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
        crc.getHeaders().add("Access-Control-Max-Age", "1209600");
    }
}