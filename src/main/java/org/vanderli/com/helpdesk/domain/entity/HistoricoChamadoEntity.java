package org.vanderli.com.helpdesk.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.vanderli.com.helpdesk.infra.data.ChamadoData;
import org.vanderli.com.helpdesk.infra.data.UserData;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HistoricoChamadoEntity {

    private Long idHistorico;
    private ChamadoData chamado; // Relacionamento com o chamado
    private UserData usuario; // Usuário que fez a alteração
    private String descricaoAlteracao;
    private LocalDateTime dataAlteracao;
}
