package com.resttest.organization;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

/**
 * @author Zach Bricker on 03/12/14.
 */
@Path("/V6.0/organizations")
public interface OrganizationsClient {
    /**
     * GET organizations/{DUNS}/competitors
     */
    @GET
    @Path("{DUNS}/competitors")
    CompetitorResponse  getCompetitors(@PathParam("DUNS") String duns);

    /**
     * GET organizations? findcompany=true& KeywordText={value}
     */
    @GET
    @Path("/")
     Object findCompany(@QueryParam("findcompany") String findCompany, @QueryParam("KeywordText") String keywordText);

    /**
     * GET organizations/{DUNS}/products/{productID}? PrincipalIdentificationNumber={principalID}
     */
    @GET
    @Path("/{DUNS}/products/{productID}")
     Object products(@PathParam("DUNS") String duns, @PathParam("productID") String productId, @QueryParam("PrincipalIdentificationNumber") String principalIdentificationNumber);

}
