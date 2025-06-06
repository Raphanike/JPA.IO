package br.com.rpires.dao.jpa;

import br.com.rpires.dao.generic.jpa.Generic.GenericJpaDB2DAO;
import br.com.rpires.domain.jpa.ClienteJpa;

public  class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

    public ClienteJpaDB2DAO() {
        super(ClienteJpa.class, "Postgre2");
    }

}
