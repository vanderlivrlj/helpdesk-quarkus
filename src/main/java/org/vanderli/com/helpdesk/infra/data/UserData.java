package org.vanderli.com.helpdesk.infra.data;

import jakarta.persistence.*;
import org.vanderli.com.helpdesk.domain.enums.PerfilUsuarioEnum;
import org.vanderli.com.helpdesk.domain.enums.StatusUsuarioEnum;

@Entity
@Table(name = "tb_usuario")
public class UserData {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long idUsuario;

    //TODO: Ajustar o tipo dos atributos
    private String nomeUsuario;
    private String emailUsuario;
    @ManyToOne
    @JoinColumn(name = "idSetor")
    private SetorData setorUsuario;
    private StatusUsuarioEnum statusUsuario;
    private PerfilUsuarioEnum perfilUsuario;

}
