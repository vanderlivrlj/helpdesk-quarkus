package org.vanderli.com.helpdesk.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.vanderli.com.helpdesk.domain.enums.StatusChamado;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChamadoEntity {

    Long idChamado;

    //TODO: Ajustar o tipo dos atributos
    String descricaoChamado;
    String tituloChamado;
    StatusChamado statusChamado;
    Timestamp dataAberturaChamado;
    Timestamp dataFechamentoChamado;
    Timestamp dataStatusChamado;

//    private UserData usuarioSolicitante;  // Quem abriu o chamado
//    private UserData tecnicoResponsavel;  // Quem Vai atender o chamado

}
