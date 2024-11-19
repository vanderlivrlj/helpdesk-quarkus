package org.vanderli.com.helpdesk.domain.entity;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.vanderli.com.helpdesk.domain.enums.StatusChamadoEnum;
import org.vanderli.com.helpdesk.infra.rest.CustomerClient;
import org.vanderli.com.helpdesk.presentation.dto.ChamadoDTO;
import org.vanderli.com.helpdesk.presentation.dto.UserDTO;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChamadoEntity {

    private Long idChamado;

    //TODO: Ajustar o tipo dos atributos
    private String descricaoChamado;
    private String tituloChamado;
    private Long idUsuario;
    private StatusChamadoEnum statusChamado;
    private LocalDateTime dataAberturaChamado;
    private LocalDateTime dataFechamentoChamado;
    //private LocalDateTime dataModificacaoChamado;

//    private UserData usuarioSolicitante;  // Quem abriu o chamado
//    private UserData tecnicoResponsavel;  // Quem Vai atender o chamado

}
