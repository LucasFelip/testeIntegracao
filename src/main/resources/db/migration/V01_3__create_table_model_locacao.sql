-- Table for locacao
CREATE SEQUENCE hibernate_sequence START WITH 1 INCREMENT BY 1;
CREATE TABLE locacao (
  id_locacao INT NOT NULL,
   id_cliente INT,
   id_imovel INT,
   valor_aluguel FLOAT NOT NULL,
   percentual_multa FLOAT NOT NULL,
   dt_vencimento date,
   dt_inicio date,
   dt_fim date,
   ativo BOOLEAN,
   obs VARCHAR(255),
   CONSTRAINT pk_locacao PRIMARY KEY (id_locacao)
);
ALTER TABLE locacao ADD CONSTRAINT FK_LOCACAO_ON_ID_CLIENTE FOREIGN KEY (id_cliente) REFERENCES cliente (id_cliente);
ALTER TABLE locacao ADD CONSTRAINT FK_LOCACAO_ON_ID_IMOVEL FOREIGN KEY (id_imovel) REFERENCES imovel (id_imovel);
