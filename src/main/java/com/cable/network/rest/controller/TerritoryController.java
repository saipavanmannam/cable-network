package com.cable.network.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cable.network.domain.TerritoryDetail;
import com.cable.network.iservice.ITerritoryService;

@RestController
public class TerritoryController {
	@Autowired
	private ITerritoryService territoryService;
	
	@RequestMapping(value = "/dish/add-territory",method = RequestMethod.POST)
	public String addTerritory(@RequestBody TerritoryDetail territoryDetail) {
		return territoryService.addTerritoryDetail(territoryDetail);
	}
	
	@RequestMapping(value = "/dish/get-territory",method = RequestMethod.POST)
	public TerritoryDetail getTerritory(@RequestParam String territoryId) {
		return territoryService.findByTerritoryId(territoryId);
		
	}
	
	
	@RequestMapping(value = "/dish/modify-territory",method = RequestMethod.PUT)
	public String modifyTerritory(@RequestBody TerritoryDetail territoryDetail) {
		return territoryService.modifyTerritoryDetail(territoryDetail);
	}
}
