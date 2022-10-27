# Atividade 3 - Teste de Integracao

## Documentação e GitHub
[Documentação da atividade](https://drive.google.com/file/d/1C9iMEJb4psmZBk_7un6U7x2WJ14lBSHM/view)\
[GitHub](https://github.com/jcpinheiro/eng-de-software2-2022/tree/master/04-minicurso-teste-integracao-locadora)


## TAREFAS

#### TAREFA 1: 
    Defina as classes do modelo com os mapeamentos JPA. Deverão serem
    criadas as classes do modelo que representam as entidades do banco juntamente
    com os seus relacionamentos e os mapeamentos JPA de acordo com a modelagem
    apresentado anteriormente. Poderá ser utilizado qualquer banco de dados
    relacional.

#### TAREFA 2: 
    Implementar a camada de acesso a dados com os CRUDs.
    Dica: Utilize o padrão Repository, e crie um DAO Genérico para reutilizar os códigos
    semelhantes.

#### TAREFA 3: 
    Crie Testes de Integração com JUnit para as funcionalidades, descrita a
    seguir:

##### Imóveis disponíveis para alugar
- Dado um bairro recuperar todos os imóveis do tipo “Apartamento” que estão disponíveis (a coluna ativo=false na tabela Locacao).
- Dado um limite de preço, recuperar todos os imóveis que estão disponíveis, com valor do aluguel (valor_aluguel_sugerido) igual ou inferior ao valor informado.


##### Lista de alugueis a partir do nome de um cliente (inquilino)
- Recuperar uma lista com todos os alugueis pagos.
- Recuperar uma lista com todos os alugues que foram pagos com atraso na data de vencimento.

##### Pagamento de um aluguel
- Inserir um novo pagamento (na tabela alugueis). Uma exceção deverá ser lançada, caso o valor_pago seja menor que o valor do aluguel (definido na tabela aluguel).
- Valor a ser pago com multa: Dado a data de vencimento e a data de pagamento, calcule o valor a ser pago, incluindo a multa. Se o pagamento estiver dentro do prazo, deverá ser retornado o valor do aluguel sem acréscimo de multas.


    OBS: A multa é calculada da seguinte forma: 0,33% por dia de atraso, limitada a 80% do valor do aluguel.

