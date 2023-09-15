package com.empresa.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "proveedor")
public class Proveedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  idProveedor;
	private String nombre;
	private String dni;
	private Date fechaRegistro;
	
	
	@ManyToOne
	@JoinColumn(name = "idTipo")
	private Tipo tipo;
	
	@ManyToOne
	@JoinColumn(name = "idPais")
	private Pais pais;
	
	 @PrePersist
	    protected void onCreate() {
	        fechaRegistro = new Date(); // Configurar la fecha actual antes de la inserción
	 }

}
