-- Table for imovel
CREATE SEQUENCE hibernate_sequence START WITH 1 INCREMENT BY 1;
CREATE TABLE imovel (
  id_imovel INT NOT NULL,
   endereco VARCHAR(255),
   bairro VARCHAR(45),
   cep INT NOT NULL,
   metragem INT NOT NULL,
   dormitorio INT NOT NULL,
   banheiro INT NOT NULL,
   suites INT NOT NULL,
   tipo_imovel VARCHAR(255),
   vagas_garagem INT NOT NULL,
   valor_aluguel_sugerido INT NOT NULL,
   obs VARCHAR(255),
   CONSTRAINT pk_imovel PRIMARY KEY (id_imovel)
);