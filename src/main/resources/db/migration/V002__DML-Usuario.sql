CREATE TABLE tb_usuario (
        idUsuario BIGINT NOT NULL PRIMARY KEY,
        nomeUsuario VARCHAR(62) NOT NULL,
        emailUsuario VARCHAR(256) NOT NULL,
        setorUsuario VARCHAR(62) NOT NULL,
        statusUsuario VARCHAR NOT NULL,
        perfilUsuario VARCHAR NOT NULL
);
