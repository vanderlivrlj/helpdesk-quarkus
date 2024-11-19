package org.vanderli.com.helpdesk.infra.data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.vanderli.com.helpdesk.domain.enums.StatusChamadoEnum;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_chamado")
public class ChamadoData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChamado;
    private String descricaoChamado;
    private String tituloChamado;
    private Long idUsuario;
    @Enumerated(EnumType.STRING)
    private StatusChamadoEnum statusChamado;
//    @ManyToOne
//    private CategoriaChamadoData categoriaChamado;
    private LocalDateTime dataAberturaChamado;
    private LocalDateTime dataFechamentoChamado;
//    private LocalDateTime dataModificacaoChamado;

//    @ManyToOne
//    @JoinColumn(name = "usuario_solicitante_id")
//    private UserData usuarioSolicitante;  // Quem abriu o chamado
//
//    @ManyToOne
//    @JoinColumn(name = "tecnico_responsavel_id")
//    private UserData tecnicoResponsavel;  // Quem Vai atender o chamado
}
