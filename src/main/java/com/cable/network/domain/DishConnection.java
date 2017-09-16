package com.cable.network.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="dish_connections")
public class DishConnection {
	@Id
	private String connectionId;
	private String name;
	private String mobileNo;
	private String address;
	private String email;
	private String connectionType;
	private TerritoryDetail territoryDetail;
	private String status;
	private Double balance;
	
	public String getConnectionId() {
		return connectionId;
	}
	public void setConnectionId(String connectionId) {
		this.connectionId = connectionId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getConnectionType() {
		return connectionType;
	}
	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public TerritoryDetail getTerritoryDetail() {
		return territoryDetail;
	}
	public void setTerritoryDetail(TerritoryDetail territoryDetail) {
		this.territoryDetail = territoryDetail;
	}
	@Override
	public String toString() {
		return "DishConnection [connectionId=" + connectionId + ", name=" + name + ", mobileNo=" + mobileNo
				+ ", address=" + address + ", email=" + email + ", connectionType=" + connectionType
				+ ", territoryDetail=" + territoryDetail + ", status=" + status + ", balance=" + balance + "]";
	}
	
	
}
