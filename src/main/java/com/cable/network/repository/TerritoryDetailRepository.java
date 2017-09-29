package com.cable.network.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cable.network.domain.TerritoryDetail;

public interface TerritoryDetailRepository extends MongoRepository<TerritoryDetail, String> {
	
	public TerritoryDetail findByTerritoryId(String territoryId);
}
