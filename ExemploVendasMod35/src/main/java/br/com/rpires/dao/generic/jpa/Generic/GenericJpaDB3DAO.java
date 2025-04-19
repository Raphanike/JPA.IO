package br.com.rpires.dao.generic.jpa.Generic;

import br.com.rpires.dao.Persistente;

import java.io.Serializable;



/**
 * @author rodrigo.pires
 *
 */
public abstract class GenericJpaDB3DAO <T extends Persistente, E extends Serializable>
        extends GenericJpaDAO<T,E> {

    public GenericJpaDB3DAO(Class<T> persistenteClass, String mysql1) {
        super(persistenteClass, "Mysql1");
    }

}