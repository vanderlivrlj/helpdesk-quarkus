package org.vanderli.com.helpdesk.domain.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.vanderli.com.helpdesk.domain.entity.ChamadoEntity;
import org.vanderli.com.helpdesk.infra.data.ChamadoData;
import org.vanderli.com.helpdesk.infra.repository.ChamadoRepository;
import org.vanderli.com.helpdesk.infra.rest.CustomerClient;
import org.vanderli.com.helpdesk.presentation.dto.ChamadoDTO;
import org.vanderli.com.helpdesk.presentation.dto.UserDTO;

@ApplicationScoped
public class ChamadoService {

    @Inject
    @RestClient
    CustomerClient customerClient;

    @Inject
    ChamadoRepository chamadoRepository;

    @Inject
    @Channel("notificacoes")
    Emitter<String> notificacaoEmitter;

    public ChamadoDTO criarChamado (ChamadoDTO chamadoDTO) {

        // 1. Validar o usuário via customer

        // 2. Criar o chamado

        // 3. Publicar a notificação no RabbitMQ

        return null;

    }

}
