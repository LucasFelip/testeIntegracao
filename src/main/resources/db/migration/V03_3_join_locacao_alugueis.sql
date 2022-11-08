-- Table for join in alugueis_locacoes
CREATE TABLE locacao_alugueis (
  id_aluguel INT NOT NULL,
   id_locacao INT NOT NULL
);
ALTER TABLE locacao_alugueis ADD CONSTRAINT uc_locacao_alugueis_id_aluguel UNIQUE (id_aluguel);
ALTER TABLE locacao_alugueis ADD CONSTRAINT fk_localu_on_aluguel FOREIGN KEY (id_aluguel) REFERENCES aluguel (id_aluguel);
ALTER TABLE locacao_alugueis ADD CONSTRAINT fk_localu_on_locacao FOREIGN KEY (id_locacao) REFERENCES locacao (id_locacao);