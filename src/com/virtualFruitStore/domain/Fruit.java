package com.virtualFruitStore.domain;

import java.util.ArrayList;

/**
 * 
 * Esta clase simboliza una fruta y sus datos.
 * 
 * Fruit myFruit = new Fruit();
 * myFruit.getPrice();
 * 
 * @version 1.00.000 2022-04-05
 * 
 * @author Brahian Stiven Osorio brahianstiven.osorio@gmail.com
 * 
 * @since 1.00.000 2022-04-05
 */
public class Fruit {
	/**
	 * Este atributo pertenece al nombre de la fruta.
	 */
	public String name;
	/**
	 * Estos atributos es el peso medio de la fruta.
	 */
	private float averageWeight;
	/**
	 * Estos atributos es el precio de la fruta.
	 */
	private double price;
	/**
	 * Este atributo es la lista de los colores que hacen parte de la fruta.
	 */
	public ArrayList<String> colors;

	/**
	 * Obtenemos la caracteristica precio de la fruta.
	 * 
	 * @return el atributo precio de la fruta.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Inicializamos la caracteristica precio de la fruta.
	 * 
	 * @param price este parametro es el precio que tiene la fruta.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Obtenemos la caracteristica name de la fruta.
	 * 
	 * @return el atributo name de la fruta.
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
	 * Inicializamos la caracteristica name de la fruta.
	 * 
	 * @param name este parametro es el nombre que tiene la fruta.
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
	 * Obtenemos la caracteristica peso promedio de la fruta.
	 * 
	 * @return el atributo peso promedio de la fruta.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public float getAverageWeight() {
		return averageWeight;
	}

	/**
	 * Inicializamos la caracteristica peso promedio de la fruta.
	 * 
	 * @param averageWeight este parametro es el peso promedio que tiene la fruta.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public void setAverageWeight(float averageWeight) {
		this.averageWeight = averageWeight;
	}

	/**
	 * Obtenemos la lista de colores que compone la fruta.
	 * 
	 * @return la lista de colores que tiene la fruta.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public ArrayList<String> getColors() {
		return colors;
	}

	/**
	 * Inicializamos la lista de los colores de la fruta.
	 * 
	 * @param color este parametro es un color que tiene la fruta.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public void setColor(String color) {
		this.colors.add(color);
	}

}
