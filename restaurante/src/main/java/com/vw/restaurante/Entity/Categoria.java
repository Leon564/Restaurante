package com.vw.restaurante.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Categoria")


public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int IdCategoria;
	private String nombre;
	
	public Categoria() {
		// TODO Auto-generated constructor stub
	}

	public Categoria(int idCategoria, String nombre) {
		super();
		IdCategoria = idCategoria;
		this.nombre = nombre;
	}

	public int getIdCategoria() {
		return IdCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		IdCategoria = idCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}