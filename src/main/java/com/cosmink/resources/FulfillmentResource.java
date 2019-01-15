package com.cosmink.resources;


import ai.api.model.Fulfillment;

import javax.annotation.security.PermitAll;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("fulfillment")
public class FulfillmentResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    @PermitAll
    public Response postFulfillment(){
        //WebhookResponse webhookResponse = WebhookResponse.getDefaultInstance();
        String s = "ciao";
        Fulfillment f = new Fulfillment();
        f.setSpeech("ciaooooo");
        return Response.ok(f, MediaType.APPLICATION_JSON).build();
    }
}
