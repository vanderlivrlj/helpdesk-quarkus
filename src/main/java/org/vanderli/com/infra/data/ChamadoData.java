package org.vanderli.com.infra.data;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_chamado")
public class ChamadoData {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long idChamado;

    //TODO: Ajustar o tipo dos atributos
    String descricaoChamado;
    String tituloChamado;
    String statusChamado;

    //TODO: Vincular o chamado a um usuário. O Vínculo deverá ser
    // tanto para o usuário que abriu como para o técnico responsável pelo atendimento
    int usuario;

}
