-- Table for join in imovel_locacoes
CREATE TABLE imovel_locacoes (
  " id_imovel" INT NOT NULL,
   " id_locacao " INT NOT NULL
);
ALTER TABLE imovel_locacoes ADD CONSTRAINT uc_imovel_locacoes__id_locacao_ UNIQUE (id_locacao);
ALTER TABLE imovel_locacoes ADD CONSTRAINT fk_imoloc_on_imovel FOREIGN KEY (id_imovel) REFERENCES imovel (id_imovel);
ALTER TABLE imovel_locacoes ADD CONSTRAINT fk_imoloc_on_locacao FOREIGN KEY (id_locacao) REFERENCES locacao (id_locacao);