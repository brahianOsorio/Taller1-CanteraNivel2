package com.virtualFruitStore.domain;

/**
 * Esta clase simboliza una cunta bancaria y sus datos.
 * 
 * @author Brahian Stiven Osorio Velasquez
 *
 */
public class BankAccount {
	/**
	 * este atributo corresponde al numero de la cuenta bancaria
	 */
	private int accountNumber;
	/**
	 * este atributo corresponde al estado de activacion de la cuenta
	 */
	protected boolean activated;
	/**
	 * obtenemos la caracteristica numero de la cuanta bancaria
	 * 
	 * @return el atributo numero de la cuenta bancaria
	 */
	public int getAccountNumber() {
		return accountNumber;
	}
	/**
	 * inicializamos el numero de la cuenta bancaria 
	 * 
	 * @param accountNumber este parametro es el numero de la cuenta bancaria
	 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * obtenemos el estado de activacion de la cuenta bancaria
	 * 
	 * @return el estado de la cuenta 
	 */
	public boolean isActivated() {
		return activated;
	}
	/**
	 * inicializamos el estado de la cuenta bancaria 
	 * 
	 * @param activated este parametro es el estado de la cuenta bancaria 
	 */
	public void setActivated(boolean activated) {
		this.activated = activated;
	}

}
