package com.test.example

import jakarta.enterprise.context.ApplicationScoped
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response

@Path("/")
@ApplicationScoped
class Resource {
    @GET
    @Path("/hello")
    @Produces(MediaType.APPLICATION_JSON)
    fun get(): Response {
        return Response.ok("hello").build()
    }
}
