package org.vanderli.com.helpdesk.infra.data;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_historico")
public class HistoricoChamadoData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHistorico;
    @ManyToOne
    @JoinColumn(name = "idChamado")
    private ChamadoData chamado; // Relacionamento com o chamado
    private String descricaoAlteracao;
    private LocalDateTime dataAlteracao;
}
