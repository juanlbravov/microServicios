/**10
 * Clase service para los productos
 * @author Juan Luis Bravo Velez
 * 
 * interface implementada para ProductoDao.java
 *  com.microservicios.springboot.app.productos.models.dao
 *
 */

package com.microservicios.springboot.app.productos.models.service;

import java.util.List;
import com.microservicios.springboot.app.productos.models.entity.Producto;

public interface InterfaceProductoService {
	
	public List<Producto> findAll();
	public Producto findById(Long id);
}
