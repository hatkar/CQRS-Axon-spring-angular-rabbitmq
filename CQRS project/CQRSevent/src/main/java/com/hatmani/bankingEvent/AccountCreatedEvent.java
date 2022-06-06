package com.hatmani.bankingEvent;

import java.math.BigDecimal;
import java.util.Date;




public class AccountCreatedEvent extends BaseEvent<String> {
	private BigDecimal initialAccount;
	private String Currency;
	private StatusAcount status;
	private String proprietaire;
	private Date dateCreation;
	/**
	 * @param id
	 * @param initialAccount
	 * @param currency
	 * @param status
	 */
	public AccountCreatedEvent(String id, BigDecimal initialAccount, String currency, StatusAcount status,String proprietaire) {
		super(id);
		this.initialAccount = initialAccount;
		Currency = currency;
		this.status = status;
		this.proprietaire= proprietaire;
		this.dateCreation= new Date();
	}
	public BigDecimal getInitialAccount() {
		return initialAccount;
	}
	public void setInitialAccount(BigDecimal initialAccount) {
		this.initialAccount = initialAccount;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	public StatusAcount getStatus() {
		return status;
	}
	public void setStatus(StatusAcount status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "AccountCreatedEvent [initialAccount=" + initialAccount + ", Currency=" + Currency + ", status=" + status
				+ ", proprietaire=" + proprietaire + ", dateCreation=" + dateCreation + "]";
	}
	public String getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
		
	}

