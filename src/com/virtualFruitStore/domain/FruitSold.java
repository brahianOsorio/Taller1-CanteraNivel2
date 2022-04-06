package com.virtualFruitStore.domain;

/**
 * 
 * Esta clase complementa las compras hechas por el usuario.
 * 
 * FruitSold myFruitSold = new FruitSold();
 * myFruitSold.getFruit();
 * 
 * @version 1.00.000 2022-04-05
 * 
 * @author Brahian Stiven Osorio brahianstiven.osorio@gmail.com
 * 
 * @since 1.00.000 2022-04-05
 */
public class FruitSold {
	/**
	 * Este atributo representa los datos de la fruta.
	 */
	public Fruit fruit;
	/**
	 * Este atributo representa la cantidad de la fruta que el cliente compra.
	 */
	public int quantity;

	/**
	 * Obtenemos la fruta comprada.
	 * 
	 * @return obtenemos el objeto fruta de la compra.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public Fruit getFruit() {
		return fruit;
	}

	/**
	 * Inializamos la fruta que se va a comprar.
	 * 
	 * @param fruit este objeto es la fruta que se va a comprar.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}

	/**
	 * Obtenemos la cantidad comprada de la fruta.
	 * 
	 * @return cantidad de la fruta.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * Inicializamos la cantidad de la fruta a comprar.
	 * 
	 * @param quantity es la cantidad a comprar de la fruta.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
