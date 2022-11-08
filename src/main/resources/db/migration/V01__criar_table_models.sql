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

-- Table for aluguel
CREATE SEQUENCE hibernate_sequence START WITH 1 INCREMENT BY 1;
CREATE TABLE aluguel (
  id_aluguel INT NOT NULL,
   dt_vencimento date,
   valor_pago INT,
   data_pagamento date,
   obs VARCHAR(255),
   alugueis INT,
   CONSTRAINT pk_aluguel PRIMARY KEY (id_aluguel)
);
ALTER TABLE aluguel ADD CONSTRAINT FK_ALUGUEL_ON_ALUGUEIS FOREIGN KEY (alugueis) REFERENCES locacao (id_locacao);
ALTER TABLE aluguel ADD CONSTRAINT FK_ALUGUEL_ON_VALOR_PAGO FOREIGN KEY (valor_pago) REFERENCES locacao (id_locacao);

-- Table for join in cliente_locacoes
CREATE TABLE cliente_locacoes (
  " id_cliente" INT NOT NULL,
   " id_locacao " INT NOT NULL
);
ALTER TABLE cliente_locacoes ADD CONSTRAINT uc_cliente_locacoes__id_locacao_ UNIQUE (id_locacao);
ALTER TABLE cliente_locacoes ADD CONSTRAINT fk_cliloc_on_cliente FOREIGN KEY (id_cliente) REFERENCES cliente (id_cliente);
ALTER TABLE cliente_locacoes ADD CONSTRAINT fk_cliloc_on_locacao FOREIGN KEY (id_locacao) REFERENCES locacao (id_locacao);

-- Table for join in imovel_locacoes
CREATE TABLE imovel_locacoes (
  " id_imovel" INT NOT NULL,
   " id_locacao " INT NOT NULL
);
ALTER TABLE imovel_locacoes ADD CONSTRAINT uc_imovel_locacoes__id_locacao_ UNIQUE (id_locacao);
ALTER TABLE imovel_locacoes ADD CONSTRAINT fk_imoloc_on_imovel FOREIGN KEY (id_imovel) REFERENCES imovel (id_imovel);
ALTER TABLE imovel_locacoes ADD CONSTRAINT fk_imoloc_on_locacao FOREIGN KEY (id_locacao) REFERENCES locacao (id_locacao);

-- Table for join in alugueis_locacoes
CREATE TABLE locacao_alugueis (
  id_aluguel INT NOT NULL,
   id_locacao INT NOT NULL
);
ALTER TABLE locacao_alugueis ADD CONSTRAINT uc_locacao_alugueis_id_aluguel UNIQUE (id_aluguel);
ALTER TABLE locacao_alugueis ADD CONSTRAINT fk_localu_on_aluguel FOREIGN KEY (id_aluguel) REFERENCES aluguel (id_aluguel);
ALTER TABLE locacao_alugueis ADD CONSTRAINT fk_localu_on_locacao FOREIGN KEY (id_locacao) REFERENCES locacao (id_locacao);