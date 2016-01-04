package com.resttest.auth;

import org.apache.cxf.jaxrs.impl.ResponseImpl;

import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * @author Zach Bricker on 03/12/14.
 */
@Path("/rest/Authentication")
public interface AuthenticationClient {
    public static final String AUTHORIZATION_HEADER = "Authorization";

    @POST
//    @HeaderParam(AUTHORIZATION_HEADER)
    Response   authenticate(@HeaderParam("x-dnb-user")String login, @HeaderParam("x-dnb-pwd") String name);
}
