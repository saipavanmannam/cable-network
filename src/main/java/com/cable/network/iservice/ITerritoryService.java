package com.cable.network.iservice;

import java.util.List;

import com.cable.network.domain.TerritoryDetail;

public interface ITerritoryService {
	public String addTerritoryDetail(TerritoryDetail territoryDetail);
	public TerritoryDetail findByTerritoryId(String territoryId);
	public String modifyTerritoryDetail(TerritoryDetail territoryDetail);
	public List<TerritoryDetail> findAllTerritories();
}
