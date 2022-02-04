package com.virtualFruitStore.domain;

import java.util.ArrayList;

/**
 * Esta clase simboliza una fruta y sus datos.
 * 
 * @author Brahian Stiven Osorio Velasquez
 *
 */
public class Fruit {
	/**
	 * Este atributo pertenece al nombre de la fruta.
	 */
	public String name;
	/**
	 * Estos atributos es el peso medio de la fruta.
	 */
	private float averageWeight ;
	/**
	 * Estos atributos es el precio de la fruta.
	 */
	private double price;
	/**
	 * Este atributo es la lista de los colores que hacen parte de la fruta.
	 */
	public ArrayList<String> colors;

	/**
	 * obtenemos la caracteristica precio de la fruta
	 * 
	 * @return el atributo precio de la fruta
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * inicializamos la caracteristica precio de la fruta
	 * 
	 * @param price este parametro es el precio que tiene la fruta
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * obtenemos la caracteristica name de la fruta
	 * 
	 * @return el atributo name de la fruta
	 */
	public String getName() {
		return name;
	}

	/**
	 * inicializamos la caracteristica name de la fruta
	 * 
	 * @param name este parametro es el nombre que tiene la fruta
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * obtenemos la caracteristica peso promedio de la fruta
	 * 
	 * @return el atributo peso promedio de la fruta
	 */
	public float getAverageWeight() {
		return averageWeight;
	}

	/**
	 * inicializamos la caracteristica peso promedio de la fruta
	 * 
	 * @param averageWeight este parametro es el peso promedio que tiene la fruta
	 */
	public void setAverageWeight(float averageWeight) {
		this.averageWeight = averageWeight;
	}

	/**
	 * obtenemos la lista de colores que compone la fruta.
	 * 
	 * @return la lista de colores que tiene la fruta
	 */
	public ArrayList<String> getColors() {
		return colors;
	}

	/**
	 * inicializamos la lista de los colores de la fruta
	 * 
	 * @param color este parametro es un color que tiene la fruta
	 */
	public void setColor(String color) {
		this.colors.add(color);
	}

}
