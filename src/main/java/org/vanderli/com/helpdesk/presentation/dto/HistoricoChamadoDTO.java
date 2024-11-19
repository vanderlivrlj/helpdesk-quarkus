package org.vanderli.com.helpdesk.presentation.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HistoricoChamadoDTO {

    private Long idHistorico;
    private Long idChamado;
    private Long idUsuario;
    private String descricaoAlteracao;
    private LocalDateTime dataAlteracao;

}
