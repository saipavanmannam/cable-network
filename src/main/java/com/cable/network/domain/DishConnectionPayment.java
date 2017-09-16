package com.cable.network.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="dish_connections")
public class DishConnectionPayment {
	@Id
	private String transactionId;
	private DishConnection dishConnection;
	private Double amount;
	private String month;
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public DishConnection getDishConnection() {
		return dishConnection;
	}
	public void setDishConnection(DishConnection dishConnection) {
		this.dishConnection = dishConnection;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	@Override
	public String toString() {
		return "DishConnectionPayment [transactionId=" + transactionId + ", dishConnection=" + dishConnection
				+ ", amount=" + amount + ", month=" + month + "]";
	}
	
}
