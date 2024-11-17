package org.vanderli.com.helpdesk.infra.data;

import jakarta.persistence.*;
import org.vanderli.com.helpdesk.domain.enums.PerfilUsuarioEnum;
import org.vanderli.com.helpdesk.domain.enums.StatusUsuarioEnum;

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
    StatusUsuarioEnum statusUsuario;
    PerfilUsuarioEnum perfilUsuario;
}
