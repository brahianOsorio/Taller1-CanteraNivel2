package com.virtualFruitStore.domain;

/**
 * 
 * Esta clase simboliza un clinte y sus datos.
 * 
 * Client myClient = new Client();
 * myClient.getId();
 * 
 * @version 1.00.000 2022-04-05
 * 
 * @author Brahian Stiven Osorio brahianstiven.osorio@gmail.com
 * 
 * @since 1.00.000 2022-04-05
 */
public class Client {
	/**
	 * Este atributo pertenece a la identificacion del cliente.
	 */
	private int id;
	/**
	 * Este atributo contiene la informacion de la persona-cliente.
	 */
	private Person person;
	/**
	 * Este atributo contiene la informacion de la cuenta bancaria del cliente.
	 */
	private BankAccount bankAccount;

	/**
	 * Obtenemos la caracteristica identificacion del cliente.
	 * 
	 * @return el atributo identificacion del cliente.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public int getId() {
		return id;
	}

	/**
	 * Inicializamos la identificacion del cliente.
	 * 
	 * @param id este parametro es el numero de la cuenta bancaria.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Obtenemos el objeto persona el cual contiene los datos peronales del cliente.
	 * 
	 * @return el objeto persona del cliente.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * Inicializamos la informacion personal del cliente como persona.
	 * 
	 * @param person este es un objeto el cual con tiene los datos de la persona.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public void setPerson(Person person) {
		this.person = person;
	}

	/**
	 * Obtenemos el objeto cuenta bancaria la cual contiene la informacion de la
	 * cuenta bancaria del cliente.
	 * 
	 * @return el objeto con la informacion de la cuenta bancaria del cliente.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public BankAccount getBankAccount() {
		return bankAccount;
	}

	/**
	 * Inicializamos la cuenta bancaria del cliente.
	 * 
	 * @param bankAccount este es un objeto el cual contiene la informacion de la
	 *                    cuenta bancaria del cliente.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

}
