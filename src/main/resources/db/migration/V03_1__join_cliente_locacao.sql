-- Table for join in cliente_locacoes
CREATE TABLE cliente_locacoes (
  " id_cliente" INT NOT NULL,
   " id_locacao " INT NOT NULL
);
ALTER TABLE cliente_locacoes ADD CONSTRAINT uc_cliente_locacoes__id_locacao_ UNIQUE (id_locacao);
ALTER TABLE cliente_locacoes ADD CONSTRAINT fk_cliloc_on_cliente FOREIGN KEY (id_cliente) REFERENCES cliente (id_cliente);
ALTER TABLE cliente_locacoes ADD CONSTRAINT fk_cliloc_on_locacao FOREIGN KEY (id_locacao) REFERENCES locacao (id_locacao);
