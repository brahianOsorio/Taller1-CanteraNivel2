package com.virtualFruitStore.domain;

import java.util.ArrayList;
import java.util.Date;

/**
 * Esta clase simboliza una factura y sus datos.
 * 
 * Bill myBill = new Bill();
 * myBill.getfinalAmount();
 * 
 * @version 1.00.000 2022-04-05
 * 
 * @author Brahian Stiven Osorio brahianstiven.osorio@gmail.com
 * 
 * @since 1.00.000 2022-04-05
 */
public class Bill {
	/**
	 * Este atributo contiene el numero de factura.
	 */
	private int billNumber;
	/**
	 * Este atributo contiene la fecha en la que se hace la factura.
	 */
	public Date date;
	/**
	 * Este atributo contiene la infromacion del cliente.
	 */
	private Client client;
	/**
	 * Este atributo contiene la lista de frutas que el cliente compro.
	 */
	public ArrayList<FruitSold> shoppingList;
	/**
	 * Este atributo contiene el acomulado final de la compra.
	 */
	public double finalAmount;

	/**
	 * Obtenemos el acomulado final de la factura.
	 * 
	 * @return la suma del precio final de todas las frutas, el precio final lo
	 *         obtiene multiplicando la cantidad por el precio de cada fruta.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public double getfinalAmount() {

		return shoppingList.stream().mapToDouble(fruitSold -> fruitSold.fruit.getPrice() * fruitSold.quantity).sum();
	}

	/**
	 * Obtenemos el numero de la factura.
	 * 
	 * @return retornamos el numero de la factura
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public int getBillNumber() {
		return billNumber;
	}

	/**
	 * Inicializamos el numero de factura.
	 * 
	 * @param billNumber este parametro es el numero de factura que va a tener la
	 *                   factura.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}

	/**
	 * Obtenemos la fecha de la compra-factura.
	 * 
	 * @return la fecha de la factura.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * Inicializamos la fecha de la factura.
	 * 
	 * @param date este parametro es la fecha en la que se hace la factura.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * Obtenemos el cliente de la factura.
	 * 
	 * @return el cliente el cual realiza la compra.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * Inicializamos al cliente de la factura.
	 * 
	 * @param client es el objeto el cual contiene la informacion del cliente.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * Obtenemos la lista de frutas compradas que hay en la factura.
	 * 
	 * @return una lista de frutas compradas.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public ArrayList<FruitSold> getShoppingList() {
		return shoppingList;
	}

	/**
	 * Inicializamos la lista y añadimos las frutas compradas.
	 * 
	 * @param shoppingList es la lista de compras que tiene la factura.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public void setShoppingList(FruitSold shoppingList) {
		this.shoppingList.add(shoppingList);
	}

}
