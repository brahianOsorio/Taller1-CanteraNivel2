package com.virtualFruitStore.domain;

import java.util.Date;

/**
 * 
 * Esta clase simboliza una persona y sus caracteristicas
 * 
 * Person myPerson = new Person();
 * myPerson.getLastNameOne();
 * 
 * @version 1.00.000 2022-04-05
 * 
 * @author Brahian Stiven Osorio brahianstiven.osorio@gmail.com
 * 
 * @since 1.00.000 2022-04-05
 */
public class Person {

	/**
	 * Estos atributos aparecen como los nombres y el género de la persona.
	 */
	public String name;
	/**
	 * Este atibuto hace referencia al primer apellido de la persona.
	 */
	public String lastNameOne;
	/**
	 * Este atibuto hace referencia al segundo apellido de la persona.
	 */
	public String lastNameTwo;
	/**
	 * Este atributo hace referencia al genero al cual pertenece la persona.
	 */
	public String gender;
	/**
	 * Este atributo aparece como la fecha de nacimiento de la persona.
	 */
	public Date dateBirth;
	/**
	 * Este atributo aparece como la altura de la persona.
	 */
	public float height;

	/**
	 * Obtenemos la caracteristica genero de la persona.
	 * 
	 * @return el atributo genero de nuestra clase.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Inicializamos la caracteristica genero de la persona.
	 * 
	 * @param este parametro es el genero que tiene la persona.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * Obtenemos el nombre.
	 * 
	 * @return el nombre de la persona.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Inicializamos el nombre.
	 * 
	 * @param name es el parametro que tenemos para el nombre de la persona.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Obtenemos el primer apellido de la persona.
	 * 
	 * @return el primer apellido de la persona.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public String getLastNameOne() {
		return lastNameOne;
	}

	/**
	 * Inicializamos el primer apellido.
	 * 
	 * @param lastNameOne este parametro pertenece al primer apellido de la persona.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public void setLastNameOne(String lastNameOne) {
		this.lastNameOne = lastNameOne;
	}

	/**
	 * Obtenemos el segundo apellido de la persona.
	 * 
	 * @return el segundo apellido de la persona.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public String getLastNameTwo() {
		return lastNameTwo;
	}

	/**
	 * Inicializamos el segundo apellido.
	 * 
	 * @param lastNameTwo este parametro pertenece al segundo apellido de la
	 *                    persona.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public void setLastNameTwo(String lastNameTwo) {
		this.lastNameTwo = lastNameTwo;
	}

	/**
	 * Obtenemos la fecha de nacimiento de la persona.
	 * 
	 * @return la fecha de nacimiento de la persona.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public Date getDateBirth() {
		return dateBirth;
	}

	/**
	 * Inicializamos la fecha de nacimiento de la persona.
	 * 
	 * @param dateBirth es el parametro de la fecha de nacimiento de la persona.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

	/**
	 * Obtenemos la altura de la persona.
	 * 
	 * @return la altura de la persona.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * Inicializamos la altura de la persona.
	 * 
	 * @param height es el parametro de la altura de la persona.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public void setHeight(float height) {
		this.height = height;
	}

}
