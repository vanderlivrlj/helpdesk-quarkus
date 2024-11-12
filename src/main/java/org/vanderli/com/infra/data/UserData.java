package org.vanderli.com.infra.data;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_usuario")
public class UserData {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long idUsuario;

    //TODO: Ajustar o tipo dos atributos
    String nomeUsuario;
    String emailUsuario;
    String setorUsuario;
    String statusUsuario;
    String perfilUsuario;
}
