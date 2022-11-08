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