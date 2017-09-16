package com.cable.network.domain;

public class AssetDetail {
	private String assetId;
	private String detail;
	private String assetLocation;
	private String assetAmount;
	private AssetType assetType;
	private String status;
	public String getAssetId() {
		return assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getAssetLocation() {
		return assetLocation;
	}
	public void setAssetLocation(String assetLocation) {
		this.assetLocation = assetLocation;
	}
	public String getAssetAmount() {
		return assetAmount;
	}
	public void setAssetAmount(String assetAmount) {
		this.assetAmount = assetAmount;
	}
	public AssetType getAssetType() {
		return assetType;
	}
	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "AssetDetail [assetId=" + assetId + ", detail=" + detail + ", assetLocation=" + assetLocation
				+ ", assetAmount=" + assetAmount + ", assetType=" + assetType + ", status=" + status + "]";
	}
	
}
