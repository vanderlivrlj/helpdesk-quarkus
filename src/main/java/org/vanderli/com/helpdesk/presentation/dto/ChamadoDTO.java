package org.vanderli.com.helpdesk.presentation.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.vanderli.com.helpdesk.domain.enums.StatusChamadoEnum;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChamadoDTO {

    private Long idChamado;

    //TODO: Ajustar o tipo dos atributos
    private String descricaoChamado;
    private String tituloChamado;
    private Long idUsuario;
    private StatusChamadoEnum statusChamado;
    private LocalDateTime dataAberturaChamado;
    private LocalDateTime dataFechamentoChamado;
    private LocalDateTime dataModificacaoChamado;

}
