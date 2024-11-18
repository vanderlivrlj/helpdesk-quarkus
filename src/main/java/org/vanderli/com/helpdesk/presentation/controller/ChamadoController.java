package org.vanderli.com.helpdesk.presentation.controller;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.vanderli.com.helpdesk.domain.service.ChamadoService;
import org.vanderli.com.helpdesk.presentation.dto.ChamadoDTO;

@Path("/chamados")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class ChamadoController {

    @Inject
    ChamadoService chamadoService;

    @POST
    public Response criarChamado(ChamadoDTO dto) {
        ChamadoDTO chamado = chamadoService.criarChamado(dto);
        return Response.status(Response.Status.CREATED)
                .entity(chamado)
                .build();
    }

}
