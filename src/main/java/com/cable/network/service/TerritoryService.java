package com.cable.network.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cable.network.domain.TerritoryDetail;
import com.cable.network.iservice.ITerritoryService;
import com.cable.network.repository.TerritoryDetailRepository;
@Service
public class TerritoryService implements ITerritoryService {
	
	@Autowired
	TerritoryDetailRepository territoryRepo;
	
	@Override
	public String addTerritoryDetail(TerritoryDetail territoryDetail) {
		TerritoryDetail territory = territoryRepo.save(territoryDetail);
		if(territory != null)
			return "SUCCESS";
		else
			return "FAIL";
		
	}

	@Override
	public TerritoryDetail findByTerritoryId(String territoryId) {
		return territoryRepo.findByTerritoryId(territoryId);
	}

	@Override
	public String modifyTerritoryDetail(TerritoryDetail territoryDetail) {
		return addTerritoryDetail(territoryDetail);
	}

	@Override
	public List<TerritoryDetail> findAllTerritories() {
		return territoryRepo.findAll();
	}

}
