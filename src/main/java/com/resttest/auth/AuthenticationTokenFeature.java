package com.resttest.auth;

import org.apache.cxf.Bus;
import org.apache.cxf.feature.AbstractFeature;
import org.apache.cxf.interceptor.InterceptorProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Zach Bricker on 03/12/14.
 * adds interceptor that adds authentication token to all requests
 */
@Component
public class AuthenticationTokenFeature extends AbstractFeature /*implements ReaderInterceptor*/{

    @Autowired
    private AuthenticationInterceptor interceptor ;

    @Override
    protected void initializeProvider(InterceptorProvider provider, Bus bus) {
        super.initializeProvider(provider, bus);
        provider.getOutInterceptors().add(interceptor);
    }

//    @Override
//    public Object aroundReadFrom(ReaderInterceptorContext context) throws IOException, WebApplicationException {
//        return null;
//    }
}
