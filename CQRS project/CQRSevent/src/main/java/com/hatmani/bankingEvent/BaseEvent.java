package com.hatmani.bankingEvent;

import java.io.Serializable;

public class BaseEvent <T> implements Serializable{
	private T id;

	/**
	 * @param id
	 */
	public BaseEvent(T id) {
		super();
		this.id = id;
	}

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "BaseEvent [id=" + id + "]";
	}

	}
