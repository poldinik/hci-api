package com.cosmink.resources;


import ai.api.model.AIRequest;
import ai.api.model.AIResponse;
import ai.api.model.Fulfillment;
import ai.api.model.Result;
import com.cosmink.models.fulfillment.FulfillmentRequest;
import com.cosmink.models.semantic.SemanticVideo;
import com.cosmink.models.semantic.SemanticVideoDao;

import javax.annotation.security.PermitAll;
import javax.inject.Inject;
import javax.persistence.PostLoad;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("fulfillment")
public class FulfillmentResource {

    @Inject
    SemanticVideoDao semanticVideoDao;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    @PermitAll
    public Response postFulfillment(){
        //WebhookResponse webhookResponse = WebhookResponse.getDefaultInstance();

        String significant = "";
        Fulfillment f = new Fulfillment();

        SemanticVideo semanticVideo = semanticVideoDao.findBySignificant(significant);

        f.setSpeech(semanticVideo.getLink());


        return Response.ok(f, MediaType.APPLICATION_JSON).build();
    }
}
