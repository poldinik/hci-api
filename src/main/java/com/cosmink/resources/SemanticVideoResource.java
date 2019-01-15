package com.cosmink.resources;

import com.cosmink.models.semantic.SemanticVideo;
import com.cosmink.models.semantic.SemanticVideoDao;

import javax.annotation.security.PermitAll;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Date;
import java.util.List;

@Path("semantic")
public class SemanticVideoResource {

    @Inject
    SemanticVideoDao semanticVideoDao;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    @PermitAll
    public Response createSemanticVideos(List<SemanticVideo> semanticVideos){

        for (SemanticVideo video:semanticVideos) {
            video.setCreated(new Date());
            video.setUpdate(new Date());

            video.setLink(video.getLink() + "?" + "ticket=TICKET_e9eb6b5a0758e1ead1ba979b825042ac472a352f");

            semanticVideoDao.create(video);
        }
        return Response.ok(semanticVideos, MediaType.APPLICATION_JSON).build();
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    @PermitAll
    public Response getSemanticVideo(@QueryParam("uuid") String uuid){

        SemanticVideo semanticVideo = semanticVideoDao.findByUuid(uuid);

        return Response.ok(semanticVideo, MediaType.APPLICATION_JSON).build();
    }
}
