package org.vanderli.com.helpdesk.presentation.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SetorDTO {
    private Long idSetor;
    private String nomeSetor;
    private String descricaoSetor;
    private String localizcaoSetor;
}
