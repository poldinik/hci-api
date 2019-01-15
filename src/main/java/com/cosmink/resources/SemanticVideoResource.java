package com.cosmink.resources;

import com.cosmink.models.semantic.SemanticVideo;
import com.cosmink.models.semantic.SemanticVideoDao;

import javax.annotation.security.PermitAll;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
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

            semanticVideoDao.create(video);
        }
        return Response.ok(semanticVideos, MediaType.APPLICATION_JSON).build();
    }
}
