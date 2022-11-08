-- Table for Cliente
CREATE SEQUENCE hibernate_sequence START WITH 1 INCREMENT BY 1;
CREATE TABLE cliente (
  id_cliente INT NOT NULL,
   nome_cliente VARCHAR(45),
   cpf INT NOT NULL,
   telefone1 INT NOT NULL,
   telefone2 INT NOT NULL,
   email VARCHAR(255),
   dt_nascimento date,
   CONSTRAINT pk_cliente PRIMARY KEY (id_cliente)
);