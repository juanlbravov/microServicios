/** 9
 *  DAO o acceso a datos
 *  Interface sin implementación
 *  
 *  Creando el repositorio JPA para los productos
 *  
 */

package com.microservicios.springboot.app.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.microservicios.springboot.app.productos.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>{
	/** public interface CrudRepository<T, ID> extends Repository<T, ID>
	 * @see CrudRepository
	 * @param <T> the domain type the repository manages
	 * @param <ID> the type of the id of the entity the repository manages
	 * @author Oliver Gierke
	 */
}
