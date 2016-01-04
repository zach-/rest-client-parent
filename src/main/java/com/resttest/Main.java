package com.resttest;

import com.resttest.organization.CompetitorResponse;
import com.resttest.organization.OrganizationsClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @author Zach Bricker on 03/12/14.
 */
public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ClientConfig.class);
        OrganizationsClient client = context.getBean(OrganizationsClient.class);
        CompetitorResponse competitors = client.getCompetitors("804735132");
        System.out.println("competitors = " + competitors);
//        ObjectMapper objectMapper = new ObjectMapper();
//        CompetitorResponse  findCompetitorResponse = objectMapper.readValue(new File("FindCompetitor_CompetitorFound_REST_Response.json"), CompetitorResponse .class);
//        System.out.println("findCompetitorResponse = " + findCompetitorResponse);
    }
}
