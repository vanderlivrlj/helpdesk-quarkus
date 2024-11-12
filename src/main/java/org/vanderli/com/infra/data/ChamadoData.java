package org.vanderli.com.infra.data;

import jakarta.persistence.*;
import org.vanderli.com.domain.enums.StatusChamado;

import java.sql.Timestamp;

@Entity
@Table(name = "tb_chamado")
public class ChamadoData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idChamado;

    //TODO: Ajustar o tipo dos atributos
    String descricaoChamado;
    String tituloChamado;
    @Enumerated(EnumType.STRING)
    StatusChamado statusChamado;
    Timestamp dataAberturaChamado;
    Timestamp dataFechamentoChamado;
    Timestamp dataStatusChamado;

//    @ManyToOne
//    @JoinColumn(name = "usuario_solicitante_id")
//    private UserData usuarioSolicitante;  // Quem abriu o chamado
//
//    @ManyToOne
//    @JoinColumn(name = "tecnico_responsavel_id")
//    private UserData tecnicoResponsavel;  // Quem Vai atender o chamado
}
