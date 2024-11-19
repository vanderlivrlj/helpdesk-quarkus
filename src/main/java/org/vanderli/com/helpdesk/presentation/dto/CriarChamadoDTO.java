package org.vanderli.com.helpdesk.presentation.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CriarChamadoDTO {

    @JsonProperty("descricaoChamado")
    private String descricaoChamado;

    @JsonProperty("tituloChamado")
    private String tituloChamado;

    @JsonProperty("idUsuario")
    private Long idUsuario;
}
