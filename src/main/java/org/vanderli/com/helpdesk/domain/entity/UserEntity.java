package org.vanderli.com.helpdesk.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    Long idUsuario;
    //TODO: Ajustar o tipo dos atributos
    String nomeUsuario;
    String emailUsuario;
    String setorUsuario;
    String statusUsuario;
    String perfilUsuario;
}
