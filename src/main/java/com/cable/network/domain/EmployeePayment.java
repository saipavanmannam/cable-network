package com.cable.network.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="dish_connections")
public class EmployeePayment {
	@Id
	private String transactionId;
	private Employee employee;
	private Double amount;
	private String months;
	private TerritoryDetail territoryDetail;
	private Date collectedDateFrom;
	private Date collectedDateTo;
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getMonths() {
		return months;
	}
	public void setMonths(String months) {
		this.months = months;
	}
	public Date getCollectedDateFrom() {
		return collectedDateFrom;
	}
	public void setCollectedDateFrom(Date collectedDateFrom) {
		this.collectedDateFrom = collectedDateFrom;
	}
	public Date getCollectedDateTo() {
		return collectedDateTo;
	}
	public void setCollectedDateTo(Date collectedDateTo) {
		this.collectedDateTo = collectedDateTo;
	}
	public TerritoryDetail getTerritoryDetail() {
		return territoryDetail;
	}
	public void setTerritoryDetail(TerritoryDetail territoryDetail) {
		this.territoryDetail = territoryDetail;
	}
	@Override
	public String toString() {
		return "EmployeePayment [transactionId=" + transactionId + ", employee=" + employee + ", amount=" + amount
				+ ", months=" + months + ", territoryDetail=" + territoryDetail + ", collectedDateFrom="
				+ collectedDateFrom + ", collectedDateTo=" + collectedDateTo + "]";
	}
	
	
	
}
