/** 11
 * como respuesta
 * Convertimos a JSON la lista de resultados
 * 
 */

package com.microservicios.springboot.app.productos.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservicios.springboot.app.productos.models.entity.Producto;
import com.microservicios.springboot.app.productos.models.service.InterfaceProductoService;

//convertir a JSON lo que retornan los metodos Handler del Controlador
@RestController 
public class ProductoController {

	// variable para obtener el puerto
	@Autowired
	private Environment env;
	
	// inyectamos nuestra clase service
	@Autowired 
	private InterfaceProductoService productoService;
	
	// creamos los metodos Handler
	// siempre public
	// definimos la informacion que vamos a convertir a JSON
	@GetMapping("/listar") // EndPoint GET, a esta ruta se van a comunicar los otros servicios con el actual
	public List<Producto> listar(){
		//return productoService.findAll();
		return productoService.findAll().stream().map(producto -> {
			producto.setPort(Integer.parseInt(env.getProperty("local.server.port")));
			return producto;
		}).collect(Collectors.toList());
	}
	
	@GetMapping("/ver/{id}") // EndPoint GET, retorna el detalle de 1 producto por id como argumento URL
	public Producto detalle(@PathVariable Long id){
		//return productoService.findById(id);
		Producto producto = productoService.findById(id);
		producto.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		return producto;
	}
}
