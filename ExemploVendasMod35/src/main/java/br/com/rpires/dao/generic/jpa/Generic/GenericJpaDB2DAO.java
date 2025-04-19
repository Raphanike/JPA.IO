package br.com.rpires.dao.generic.jpa.Generic; /**
 *
 */


import br.com.rpires.dao.Persistente;
import br.com.rpires.dao.generic.jpa.GenericJpaDAO;

import java.io.Serializable;

/**
 * @author rodrigo.pires
 *
 */
public abstract class GenericJpaDB2DAO <T extends Persistente, E extends Serializable>
        extends GenericJpaDAO<T,E> {

    public GenericJpaDB2DAO(Class<T> persistenteClass, String postgre2) {
        super(persistenteClass, "Postgre2");
    }

}
