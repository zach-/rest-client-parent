package com.resttest.auth;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Zach Bricker on 03/12/14.
 */
@Component
public class AuthenticationInterceptor extends AbstractPhaseInterceptor<Message> {

    public static final String LOGIN = "P200000F513584E0B7546FF93D483567";
    public static final String PASSWORD = "ZUz-qRt-3ZP-H2x";

    @Autowired
    private AuthenticationClient authenticationClient;

    private String token;

    public AuthenticationInterceptor() {
        super(Phase.PRE_MARSHAL);
    }

    @Override
    public void handleMessage(Message message) throws Fault {
        Map<String, List<String>> o = (Map<String, List<String>>) message.get(Message.PROTOCOL_HEADERS);
        if (token == null) {
            Response  authorizationResponse = authenticationClient.authenticate(LOGIN, PASSWORD);
            MultivaluedMap<String, Object> headers = authorizationResponse.getHeaders();
            token = (String) headers.get(AuthenticationClient.AUTHORIZATION_HEADER).get(0);

        }
        List<String> authHeaders = new ArrayList<String>(1);
        authHeaders.add(token);
        o.put(AuthenticationClient.AUTHORIZATION_HEADER, authHeaders);
    }
}
