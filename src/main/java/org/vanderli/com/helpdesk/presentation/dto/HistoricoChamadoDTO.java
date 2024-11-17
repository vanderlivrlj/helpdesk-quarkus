package org.vanderli.com.helpdesk.presentation.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.vanderli.com.helpdesk.infra.data.ChamadoData;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HistoricoChamadoDTO {

    private Long idHistorico;
    private ChamadoData chamado; // Relacionamento com o chamado
    private String descricaoAlteracao;
    private LocalDateTime dataAlteracao;

}
