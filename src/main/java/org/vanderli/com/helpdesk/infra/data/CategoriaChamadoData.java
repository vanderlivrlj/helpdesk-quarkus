package org.vanderli.com.helpdesk.infra.data;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_categoria")
public class CategoriaChamadoData {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long idCategoria;
    private String nomeCategoria;
    private String descricaoCategoria;
    private boolean ativa;

}
