package org.vanderli.com.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.vanderli.com.domain.enums.StatusChamado;
import org.vanderli.com.infra.data.UserData;

import java.sql.Timestamp;
import java.time.LocalDate;

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
