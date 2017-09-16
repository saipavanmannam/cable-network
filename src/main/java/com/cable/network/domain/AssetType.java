package com.cable.network.domain;

public class AssetType {
	private String assetTypeId;
	private String description;
	private String assetType;
	public String getAssetTypeId() {
		return assetTypeId;
	}
	public void setAssetTypeId(String assetTypeId) {
		this.assetTypeId = assetTypeId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAssetType() {
		return assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}
	@Override
	public String toString() {
		return "AssetType [assetTypeId=" + assetTypeId + ", description=" + description + ", assetType=" + assetType
				+ "]";
	}
}
