CREATE TABLE tb_chamado
(
    idChamado             BIGINT       NOT NULL PRIMARY KEY,
    tituloChamado         VARCHAR(62)  NOT NULL,
    descricaoChamado      VARCHAR(512) NOT NULL,
    statusChamado         VARCHAR      NOT NULL,
    dataAberturaChamado   TIMESTAMP    NOT NULL,
    dataFechamentoChamado TIMESTAMP NULL,
    dataStatusChamado     TIMESTAMP NULL
);
