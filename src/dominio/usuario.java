/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.Objects;

/**
 *
 * @author Juan Labandeira
 */
public class usuario {
    //declaración de varaiables
    private String nombre;
    private String apellido;
    private String nombreUsuario;
    private int numTelef;

    public usuario() {
    }

    public usuario(String nombreUsuario) {
	this.nombreUsuario = nombreUsuario;
    }

    public usuario(String nombre, String apellido, String nombreUsuario, int numTelef) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.nombreUsuario = nombreUsuario;
	this.numTelef = numTelef;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public String getApellido() {
	return apellido;
    }

    public void setApellido(String apellido) {
	this.apellido = apellido;
    }

    public String getNombreUsuario() {
	return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
	this.nombreUsuario = nombreUsuario;
    }

    public int getNumTelef() {
	return numTelef;
    }

    public void setNumTelef(int numTelef) {
	this.numTelef = numTelef;
    }

    @Override
    public String toString() {
	StringBuilder sb = new StringBuilder();
	
	sb.append("nombre: ").append(nombre);
	sb.append(", apellido: ").append(apellido);
	sb.append(", nombreUsuario: ").append(nombreUsuario);
	sb.append(", numTelef: ").append(numTelef);
	sb.append('}');
	return sb.toString();
    }

    @Override
    public int hashCode() {
	int hash = 5;
	hash = 37 * hash + Objects.hashCode(this.nombre);
	hash = 37 * hash + Objects.hashCode(this.apellido);
	hash = 37 * hash + Objects.hashCode(this.nombreUsuario);
	hash = 37 * hash + this.numTelef;
	return hash;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj) {
	    return true;
	}
	if (obj == null) {
	    return false;
	}
	if (getClass() != obj.getClass()) {
	    return false;
	}
	final usuario other = (usuario) obj;
	if (this.numTelef != other.numTelef) {
	    return false;
	}
	if (!Objects.equals(this.nombre, other.nombre)) {
	    return false;
	}
	if (!Objects.equals(this.apellido, other.apellido)) {
	    return false;
	}
	return Objects.equals(this.nombreUsuario, other.nombreUsuario);
    }
    

    
   
    
    
    
}
