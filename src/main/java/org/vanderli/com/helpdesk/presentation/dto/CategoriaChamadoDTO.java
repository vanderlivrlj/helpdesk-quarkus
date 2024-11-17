package org.vanderli.com.helpdesk.presentation.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaChamadoDTO {

    private Long idCategoria;
    private String nomeCategoria;
    private String descricaoCategoria;
    private boolean ativa;

}
