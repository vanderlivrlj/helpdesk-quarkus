package org.vanderli.com.helpdesk.domain.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.vanderli.com.helpdesk.domain.entity.ChamadoEntity;
import org.vanderli.com.helpdesk.domain.enums.StatusChamadoEnum;
import org.vanderli.com.helpdesk.infra.data.ChamadoData;
import org.vanderli.com.helpdesk.infra.repository.ChamadoRepository;
import org.vanderli.com.helpdesk.infra.rest.CustomerClient;
import org.vanderli.com.helpdesk.presentation.dto.ChamadoDTO;
import org.vanderli.com.helpdesk.presentation.dto.CriarChamadoDTO;
import org.vanderli.com.helpdesk.presentation.dto.UserDTO;
import org.vanderli.com.helpdesk.presentation.mapper.ChamadoMapper;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@ApplicationScoped
public class ChamadoService {

//    @Inject
//    @RestClient
//    CustomerClient customerClient;

    @Inject
    ChamadoRepository chamadoRepository;

    @Inject
    ChamadoMapper chamadoMapper;

    @Inject
    @Channel("notificacoes")
    Emitter<String> notificacaoEmitter;

    @Transactional
    public ChamadoDTO criarChamado(CriarChamadoDTO dto) {
        // 1. Converte CriarChamadoDTO para ChamadoEntity
        ChamadoEntity chamadoEntity = chamadoMapper.toEntity(dto);
        chamadoEntity.setStatusChamado(StatusChamadoEnum.ABERTO);
        chamadoEntity.setDataAberturaChamado(LocalDateTime.now());

        // 2. Converte ChamadoEntity para ChamadoData e persiste no banco
        ChamadoData chamadoData = chamadoMapper.toData(chamadoEntity);
        System.out.println("ChamadoData mapeado: " + chamadoData);
        chamadoRepository.persist(chamadoData);

        // 3. Atualiza ChamadoEntity com dados gerados no banco (ID)
        chamadoEntity = chamadoMapper.toEntity(chamadoData);

        // 4. Converte ChamadoEntity para ChamadoDTO e retorna
        return chamadoMapper.toDTO(chamadoEntity);
    }


}
