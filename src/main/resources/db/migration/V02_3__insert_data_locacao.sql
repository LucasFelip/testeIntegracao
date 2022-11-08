INSERT
INTO
  Locacao
  (id_locacao, id_cliente, id_imovel, valor_aluguel, percentual_multa, dt_vencimento, dt_inicio, dt_fim, ativo, obs)
VALUES
  (1, 1, 1, 15.0, 3.0, current_date, current_date, current_date, 0, '');