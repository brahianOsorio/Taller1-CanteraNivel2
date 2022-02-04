package com.virtualFruitStore.domain;
/**
 * esta clase complementa las compras hechas por el usuario 
 * @author Brahian Stiven Osorio 
 *
 */
public class FruitSold {
	/**
	 * este atributo representa los datos de la fruta 
	 */
	public Fruit fruit ;
	/**
	 * este atributo representa la cantidad de la fruta que el cliente compra
	 */
	public int quantity ;
	/**
	 * obtenemos la fruta comprada 
	 * @return obtenemos el objeto fruta de la compra
	 */
	public Fruit getFruit() {
		return fruit;
	}
	/**
	 * inializamos la fruta que se va a comprar 
	 * @param fruit este objeto es la fruta que se va a comprar
	 */
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	/**
	 * obtenemos la cantidad comprada de la fruta 
	 * @return cantidad de la fruta 
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * inicializamos la cantidad de la fruta a comprar
	 * @param quantity es la cantidad a comprar de la fruta
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
