package com.resttest;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.resttest.auth.AuthenticationClient;
import com.resttest.auth.AuthenticationTokenFeature;
import com.resttest.auth.StreamReplaceFeature;
import com.resttest.organization.OrganizationsClient;
import org.apache.cxf.feature.Feature;
import org.apache.cxf.feature.LoggingFeature;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.WebClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zach Bricker on 03/12/14.
 */
@Configuration
@ComponentScan("com.resttest")
public class ClientConfig {

    public static final String ADDRESS = "https://maxcvservices.dnb.com";

    @Autowired
    private AuthenticationTokenFeature authenticationTokenFeature;
//    @Autowired
//    private StreamReplaceFeature streamReplaceFeature;

    @Bean
    public AuthenticationClient authenticationClient() {
        List<Object> providers = new ArrayList<Object>();
        providers.add(new JacksonJsonProvider());
        ArrayList<Feature> features = new ArrayList<Feature>();
        features.add(new LoggingFeature());
//        features.add(streamReplaceFeature);
        AuthenticationClient oerClient = JAXRSClientFactory.create(ADDRESS, AuthenticationClient.class, providers,features,null);

        WebClient.client(oerClient).accept("application/json");
        return oerClient;
    }

    @Bean
    public OrganizationsClient organizationsClient() {
        List<Object> providers = new ArrayList<Object>();
        providers.add(new JacksonJsonProvider());
        ArrayList<Feature> features = new ArrayList<Feature>();
        features.add(authenticationTokenFeature);
        OrganizationsClient organizationsClient = JAXRSClientFactory.create(ADDRESS, OrganizationsClient.class, providers, features, null);
        WebClient.client(organizationsClient).accept("application/json");

        return organizationsClient;
    }


}
