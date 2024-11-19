package org.vanderli.com.helpdesk.infra.rest;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.vanderli.com.helpdesk.presentation.dto.UserDTO;

//@RegisterRestClient(configKey = "customer-api")
//@ApplicationScoped
public interface CustomerClient {

//    @GET
//    @Path("/usuarios/{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    UserDTO getUsuarioById(@PathParam("id") Long id);
}
