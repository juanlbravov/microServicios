/** 10
 *  componente service para los productos
 */
package com.microservicios.springboot.app.productos.models.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microservicios.springboot.app.productos.models.dao.ProductoDao;
import com.microservicios.springboot.app.productos.models.entity.Producto;

@Service
public class ProductoServiceImplement implements InterfaceProductoService{

	@Autowired // 
	private ProductoDao productoDao;
	
	@Override
	@Transactional(readOnly = true) // marcamos transaccion con dao como solo lectura
	public List<Producto> findAll() {
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true) // marcamos transaccion con dao como solo lectura
	public Producto findById(Long id) {
		return productoDao.findById(id).orElse(null);
	}
}
