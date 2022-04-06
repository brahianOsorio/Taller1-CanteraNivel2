package com.virtualFruitStore.domain;

/**
 * Esta clase simboliza una cunta bancaria y sus datos.
 * 
 * BankAccount myBankAccount = new BankAccount();
 * myBankAccount.getAccountNumber();
 * 
 * @version 1.00.000 2022-04-05
 * 
 * @author Brahian Stiven Osorio brahianstiven.osorio@gmail.com
 * 
 * @since 1.00.000 2022-04-05
 */
public class BankAccount {
	/**
	 * Este atributo corresponde al numero de la cuenta bancaria.
	 */
	private int accountNumber;
	/**
	 * Este atributo corresponde al estado de activacion de la cuenta.
	 */
	protected boolean activated;

	/**
	 * Obtenemos la caracteristica numero de la cuanta bancaria.
	 * 
	 * @return el atributo numero de la cuenta bancaria.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public int getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Inicializamos el numero de la cuenta bancaria.
	 * 
	 * @param accountNumber este parametro es el numero de la cuenta bancaria.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * Obtenemos el estado de activacion de la cuenta bancaria.
	 * 
	 * @return el estado de la cuenta.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public boolean isActivated() {
		return activated;
	}

	/**
	 * Inicializamos el estado de la cuenta bancaria.
	 * 
	 * @param activated este parametro es el estado de la cuenta bancaria.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-04-05
	 * 
	 */
	public void setActivated(boolean activated) {
		this.activated = activated;
	}

}
