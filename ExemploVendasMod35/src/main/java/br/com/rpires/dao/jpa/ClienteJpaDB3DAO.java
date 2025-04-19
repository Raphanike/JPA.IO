package br.com.rpires.dao.jpa;

import br.com.rpires.dao.generic.jpa.Generic.GenericJpaDB3DAO;
import br.com.rpires.domain.jpa.ClienteJpa2;

/**
 * @author rodrigo.pires
 *
 */
public class ClienteJpaDB3DAO extends GenericJpaDB3DAO<ClienteJpa2, Long> implements IClienteJpaDAO<ClienteJpa2> {

    public ClienteJpaDB3DAO() {
        super(ClienteJpa2.class, "Mysql1");
    }

}
