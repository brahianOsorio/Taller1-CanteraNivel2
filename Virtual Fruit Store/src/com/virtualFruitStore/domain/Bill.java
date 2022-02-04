package com.virtualFruitStore.domain;

import java.util.ArrayList;
import java.util.Date;

/**
 * esta clase simboliza una factura y sus datos
 * 
 * @author Brahian Stiven Osorio Velasquez
 *
 */
public class Bill {
	/**
	 * este atributo contiene el numero de factura
	 */
	private int billNumber;
	/**
	 * este atributo contiene la fecha en la que se hace la factura
	 */
	public Date date;
	/**
	 * este atributo contiene la infromacion del cliente
	 */
	private Client client;
	/**
	 * este atributo contiene la lista de frutas que el cliente compro
	 */
	public ArrayList<FruitSold> shoppingList;
	/**
	 * este atributo contiene el acomulado final de la compra
	 */
	public double finalAmount;

	/**
	 * obtenemos el acomulado final de la factura
	 * 
	 * @return la suma del precio final de todas las frutas, el precio final lo
	 *         obtiene multiplicando la cantidad por el precio de cada fruta. 
	 */
	public double getfinalAmount() {

		return shoppingList.stream().mapToDouble(fruitSold -> fruitSold.fruit.getPrice() * fruitSold.quantity).sum();
	}

	/**
	 * obtenemos el numero de la factura
	 * 
	 * @return el numero de factura
	 */
	public int getBillNumber() {
		return billNumber;
	}

	/**
	 * inicializamos el numero de factura
	 * 
	 * @param billNumber este parametro es el numero de factura que va a tener la
	 *                   factura
	 */

	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}

	/**
	 * obtenemos la fecha de la compra-factura
	 * 
	 * @return la fecha de la factura
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * inicializamos la fecha de la factura
	 * 
	 * @param date este parametro es la fecha en la que se hace la factura
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * obtenemos el cliente de la factura
	 * 
	 * @return el cliente el cual realiza la compra
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * inicializamos al cliente de la factura
	 * 
	 * @param client es el objeto el cual contiene la informacion del cliente
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * obtenemos la lista de frutas compradas que hay en la factura
	 * 
	 * @return una lista de frutas compradas
	 */
	public ArrayList<FruitSold> getShoppingList() {
		return shoppingList;
	}

	/**
	 * inicializamos la lista y añadimos las frutas compradas
	 * 
	 * @param shoppingList
	 */
	public void setShoppingList(FruitSold shoppingList) {
		this.shoppingList.add(shoppingList);
	}

}
