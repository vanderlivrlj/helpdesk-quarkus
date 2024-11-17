package org.vanderli.com.helpdesk.infra.data;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_setor")
public class SetorData {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long idSetor;
    private String nomeSetor;
    private String descricaoSetor;
    private String localizcaoSetor;

}
