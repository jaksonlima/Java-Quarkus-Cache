package com.jakson.lima.cache;

import io.quarkus.cache.CacheResult;
import lombok.extern.java.Log;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Log
@Path("/cache")
public class GreetingResource {

    @GET
    @CacheResult(cacheName = "lima")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        log.info("Sucessfull cache");

        return "Sucessfull cache";
    }
}