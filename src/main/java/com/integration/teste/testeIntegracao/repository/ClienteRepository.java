package repository;

import model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
    Cliente findFirstByName(String nome);
}
