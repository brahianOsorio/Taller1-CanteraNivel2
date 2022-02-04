package com.virtualFruitStore.domain;

import java.util.Date;

/**
 * Esta clase simboliza una persona y sus caracteristicas
 * 
 * @author Brahian Stiven Osorio Velasquez
 *
 */
public class Person {

	/**
	 * Estos atributos aparecen como los nombres y el género de la persona.
	 */
	public String name, lastName1, lastName2, gender;
	/**
	 * este atributo aparece como la fecha de nacimiento de la persona.
	 */
	public Date dateBirth;
	/**
	 * este atributo aparece como la altura de la persona.
	 */
	public float height;

	/**
	 * obtenemos la caracteristica genero de la persona
	 * 
	 * @return el atributo genero de nuestra clase
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * inicializamos la caracteristica genero de la persona
	 * 
	 * @param este parametro es el genero que tiene la persona
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * obtenemos el nombre
	 * 
	 * @return el nombre de la persona
	 */
	public String getName() {
		return name;
	}

	/**
	 * inicializamos el nombre
	 * 
	 * @param name es el parametro que tenemos para el nombre de la persona
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * obtenemos el primer apellido de la persona
	 * 
	 * @return el primer apellido de la persona
	 */
	public String getLastName1() {
		return lastName1;
	}

	/**
	 * inicializamos el primer apellido
	 * 
	 * @param lastName1 este parametro pertenece al primer apellido de la persona
	 */
	public void setLastName1(String lastName1) {
		this.lastName1 = lastName1;
	}

	/**
	 * obtenemos el segundo apellido de la persona
	 * 
	 * @return el segundo apellido de la persona
	 */
	public String getLastName2() {
		return lastName2;
	}

	/**
	 * inicializamos el segundo apellido
	 * 
	 * @param lastName2 este parametro pertenece al segundo apellido de la persona
	 */
	public void setLastName2(String lastName2) {
		this.lastName2 = lastName2;
	}

	/**
	 * obtenemos la fecha de nacimiento de la persona
	 * 
	 * @return la fecha de nacimiento de la persona
	 */
	public Date getDateBirth() {
		return dateBirth;
	}

	/**
	 * inicializamos la fecha de nacimiento de la persona.
	 * 
	 * @param dateBirth es el parametro de la fecha de nacimiento de la persona
	 */
	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

	/**
	 * obtenemos la altura de la persona
	 * 
	 * @return la altura de la persona
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * inicializamos la altura de la persona.
	 * 
	 * @param height es el parametro de la altura de la persona.
	 */
	public void setHeight(float height) {
		this.height = height;
	}

}
