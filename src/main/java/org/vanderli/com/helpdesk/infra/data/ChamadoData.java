package org.vanderli.com.helpdesk.infra.data;

import jakarta.persistence.*;
import org.vanderli.com.helpdesk.domain.enums.StatusChamadoEnum;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_chamado")
public class ChamadoData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChamado;

    //TODO: Ajustar o tipo dos atributos
    private String descricaoChamado;
    private String tituloChamado;
    @Enumerated(EnumType.STRING)
    private StatusChamadoEnum statusChamado;
    @ManyToOne
    private UserData usuarioCriado;
    @ManyToOne
    private UserData usuarioResponsavel;
    @ManyToOne
    private CategoriaChamadoData categoriaChamado;
    private LocalDateTime dataAberturaChamado;
    private LocalDateTime dataFechamentoChamado;
    private LocalDateTime dataModificacaoChamado;

//    @ManyToOne
//    @JoinColumn(name = "usuario_solicitante_id")
//    private UserData usuarioSolicitante;  // Quem abriu o chamado
//
//    @ManyToOne
//    @JoinColumn(name = "tecnico_responsavel_id")
//    private UserData tecnicoResponsavel;  // Quem Vai atender o chamado
}
