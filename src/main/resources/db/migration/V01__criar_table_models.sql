-- Table cliente
CREATE TABLE cliente (
  id_cliente INT AUTO_INCREMENT NOT NULL,
   nome VARCHAR(45),
   cpf INT NOT NULL,
   telefone_1 INT NOT NULL,
   telefone_2 INT NOT NULL,
   email VARCHAR(255),
   dt_nascimento TIMESTAMP,
   CONSTRAINT pk_cliente PRIMARY KEY (id_cliente)
);

-- table imovel
CREATE TABLE imovel (
  id_imovel INT AUTO_INCREMENT NOT NULL,
   endereco VARCHAR(255),
   bairro VARCHAR(45),
   cep INT NOT NULL,
   metragem INT NOT NULL,
   dormitorio INT NOT NULL,
   banheiro INT NOT NULL,
   suites INT NOT NULL,
   vagas_garagem INT NOT NULL,
   valor_sugerido INT NOT NULL,
   obs VARCHAR(255),
   CONSTRAINT pk_imovel PRIMARY KEY (id_imovel)
);

-- Table locacao
CREATE TABLE locacao (
  id_locacao INT AUTO_INCREMENT NOT NULL,
   inquilino_id_cliente INT,
   imovel_id_imovel INT,
   valor_aluguel FLOAT NOT NULL,
   percentual_multa FLOAT NOT NULL,
   dt_vencimento TIMESTAMP,
   dt_inicio TIMESTAMP,
   dt_fim TIMESTAMP,
   ativo BOOLEAN,
   obs VARCHAR(255),
   CONSTRAINT pk_locacao PRIMARY KEY (id_locacao)
);
ALTER TABLE locacao ADD CONSTRAINT FK_LOCACAO_ON_IMOVEL_ID_IMOVEL FOREIGN KEY (imovel_id_imovel) REFERENCES imovel (id_imovel);
ALTER TABLE locacao ADD CONSTRAINT FK_LOCACAO_ON_INQUILINO_ID_CLIENTE FOREIGN KEY (inquilino_id_cliente) REFERENCES cliente (id_cliente);

-- Table aluguel
CREATE TABLE aluguel (
  dt_vencimento TIMESTAMP NOT NULL,
   locacao_id_locacao INT,
   valor_pago FLOAT NOT NULL,
   dt_pagamento TIMESTAMP,
   obs VARCHAR(255),
   CONSTRAINT pk_aluguel PRIMARY KEY (dt_vencimento)
);
ALTER TABLE aluguel ADD CONSTRAINT FK_ALUGUEL_ON_LOCACAO_ID_LOCACAO FOREIGN KEY (locacao_id_locacao) REFERENCES locacao (id_locacao);


