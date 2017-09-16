package com.cable.network.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import com.cable.network.domain.DishConnection;

public interface DishConnectionRepository extends MongoRepository<DishConnection, String>{
	public DishConnection findByConnectionId(String connectionId);
}
