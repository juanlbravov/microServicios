/** 8
 *  Definimos la clase Entity Producto
 *  creamos la tabla "productos"
 *  columnas  id | nombre | precio | createAt
 *  implementar como Serializable: convertir este objeto en bits
 */

package com.microservicios.springboot.app.productos.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "productos") //nombre de la tabla
public class Producto implements Serializable{

	@Id //llave primaria importada de persistence
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Estrategia = configura nuestra llave autoincremental
	private Long id;
	
	private String nombre;
	private Double precio;
	
	@Column(name = "create_at") // definimos el nombre de la Columna en la tabla
	@Temporal(TemporalType.DATE) // formato = solo queremos la Fecha
	private Date createAt;
	
	// para saber a qui puerto nos conectamos 
	@Transient  // atributo que le indica a la app que este dato NO es persistente
	private Integer port;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}


	/**
	 * version 1.0.0
	 * lo definimos como serializable
	 * definimos su serial version ID
	 */
	private static final long serialVersionUID = 1285454306356845809L;
	
}
