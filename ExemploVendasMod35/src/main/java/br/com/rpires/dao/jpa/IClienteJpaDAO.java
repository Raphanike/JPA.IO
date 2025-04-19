/**
 * 
 */
package br.com.rpires.dao.jpa;

import br.com.rpires.dao.Persistente;
import br.com.rpires.dao.generic.jpa.IGenericJapDAO;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
