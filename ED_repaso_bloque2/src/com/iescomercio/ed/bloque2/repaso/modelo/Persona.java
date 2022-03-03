package com.iescomercio.ed.bloque2.repaso.modelo;

public class Persona{
	
	private String dni;
	private String nombre;
	private String apellido1;
	
	public Persona() {}
	
	/**
	 * 
	 * @param dni El dni de la persona
	 * @param nombre El nombre de la persona
	 * @param apellido1 El primer apellido de la persona
	 */
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}
	
	/**
	 * 
	 * @return Retorna el dni de la persona
	 */
	public String getDni() {
		return dni;
	}
	
	
	/**
	 * 
	 * Metodo para cambiar el dni de una persona
	 * 
	 * @param dni Dni que se quiere cambiar
	 * @throws Exception Si el ultimo caracter del dni no es una letra de error
	 */
	
	public void setDni(String dni) throws Exception {
		//comprobacion de si el ultimo caracter es una letra
		if(Character.isLetter(dni.charAt(dni.length()))) {
			this.dni=dni;
		}else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}
	
	/**
	 * 
	 * @return Devuelve el nombre de una persona
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * 
	 * Metodo para cambiar el nombre a una persona
	 * 
	 * @param nombre El nombre de la persona que se quiere cambiar
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * 
	 * @return Devuelve el primer apellido de una persona
	 */
	public String getApellido1() {
		return apellido1;
	}
	
	/**
	 * 
	 * Metodo para cambiar el primer apellido a una persona
	 * 
	 * @param apellido1 El apellido de la persona que se quiere cambiar
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	

}
