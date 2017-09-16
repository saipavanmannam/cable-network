package com.cable.network.domain;

public class TerritoryDetail {
	private String territoryId;
	private String name;
	private String level;
	private String description;
	
	@Override
	public String toString() {
		return "TerritoryDetail [territoryId=" + territoryId + ", name=" + name + ", level=" + level + ", description="
				+ description + "]";
	}

	public String getTerritoryId() {
		return territoryId;
	}

	public void setTerritoryId(String territoryId) {
		this.territoryId = territoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
