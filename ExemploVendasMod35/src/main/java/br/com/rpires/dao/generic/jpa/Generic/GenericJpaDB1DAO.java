package br.com.rpires.dao.generic.jpa.Generic;

import java.io.Serializable;

import br.com.rpires.dao.Persistente;
import br.com.rpires.dao.generic.jpa.GenericJpaDAO;


/**
 * @author rodrigo.pires
 *
 */
public  class GenericJpaDB1DAO <T extends Persistente, E extends Serializable>
        extends GenericJpaDAO<T,E> {

    public GenericJpaDB1DAO(Class<T> persistenteClass) {
        super(persistenteClass, "Postgre1");
    }

}