package com.virtualFruitStore.domain;

/**
 * esta clase simboliza un clinte y sus datos
 * 
 * @author Brahian Stiven Osorio Velasquez
 *
 */
public class Client {
	/**
	 * este atributo pertenece a la identificacion del cliente 
	 */
	private int id;
	/**
	 * este atributo contiene la informacion de la persona-cliente 
	 */
	private Person person;
	/**
	 * este atributo contiene la informacion de la cuenta bancaria del cliente
	 */
	private BankAccount bankAccount;
	/**
	 * obtenemos la caracteristica identificacion del cliente
	 * 
	 * @return el atributo identificacion del cliente
	 */
	public int getId() {
		return id;
	}
	/**
	 * inicializamos la identificacion del cliente 
	 * 
	 * @param id este parametro es el numero de la cuenta bancaria
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * obtenemos el objeto persona el cual contiene los datos peronales del cliente
	 * 
	 * @return el objeto persona del cliente
	 */
	public Person getPerson() {
		return person;
	}
	/**
	 * inicializamos la informacion personal del cliente como persona 
	 * 
	 * @param person este es un objeto el cual con tiene los datos de la persona
	 */
	public void setPerson(Person person) {
		this.person = person;
	}
	/**
	 * obtenemos el objeto cuenta bancaria la cual contiene la informacion de la cuenta bancaria del cliente 
	 * 
	 * @return el objeto con la informacion de la cuenta bancaria del cliente 
	 */
	public BankAccount getBankAccount() {
		return bankAccount;
	}
	/**
	 * inicializamos la cuenta bancaria del cliente 
	 * 
	 * @param bankAccount este es un objeto el cual contiene la informacion de la cuenta bancaria del cliente 
	 */
	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

}
