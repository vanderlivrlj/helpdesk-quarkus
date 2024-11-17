package org.vanderli.com.helpdesk.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaChamadoEntity {

    private Long idCategoria;
    private String nomeCategoria;
    private String descricaoCategoria;
    private boolean ativa;

}
