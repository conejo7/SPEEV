/*
 * Henry Coral Utilities
 * Libreria: Persistencia
 * 
 * Los contenidos de este archivo son propiedad intelectual de Henry Coral
 * se encuentran protegidos por la licencia LGPL.
 * 
 * Usted puede encontrar una copia de esta licencia en: 
 *   https://www.gnu.org/licenses/lgpl-3.0.en.html
 * 
 * Se permite el uso del código contenido en este archivo.
 */
package com.persist.common.dao;

/**
 * Clase de utilidad que define el ordenamiento de consultas.
 * 
 * @author Henry Coral 
 * @version 1.0
 * 
 */
public final class Order {

	/**
	 * Constante utilizada para definir ordenamiento ascendente.
	 */
	public static final String ASC = "A,";
	/**
	 * Constante utilizada para definir ordenamiento descendente.
	 */
	public static final String DESC = "D,";
	
	/**
	 * Constructor por defecto.
	 */
	private Order() {
		
	}
	
	/**
	 * Retorna un objeto que especifica que la propiedad recibida como 
	 * parametro sera tomada para ordenamiento ascendente.
	 * 
	 * @param propiedad Propiedad de la entidad que sera utilizada para el ordenamiento.
	 * @return Cadena que especifica el ordenamiento.
	 */
	public static String ascendente(String propiedad) {
		return ASC+propiedad;
	}
	
	/**
	 * Retorna un objeto que especifica que la propiedad recibida como 
	 * parametro sera tomada para ordenamiento descendente.
	 * 
	 * @param propiedad Propiedad de la entidad que sera utilizada para el ordenamiento.
	 * @return Cadena que especifica el ordenamiento.
	 */
	public static String descendente(String propiedad) {
		return DESC+propiedad;
	}
}
