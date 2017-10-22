package com.cable.network.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cable.network.domain.DishConnection;
import com.cable.network.iservice.IDishConnectionService;
import com.cable.network.repository.DishConnectionRepository;

@Service
public class DishConnectionService implements IDishConnectionService{

	@Autowired
	private DishConnectionRepository dishConnectionRepo;
	
	@Override
	public String addConnection(DishConnection connection) {
		dishConnectionRepo.save(connection);
		return "Success";
	}

	@Override
	public DishConnection findByConnectionId(String connectionId) {
		return dishConnectionRepo.findByConnectionId(connectionId);
	}

	@Override
	public List<DishConnection> findByName(String name) {
		List<DishConnection> dishConnections = dishConnectionRepo.findAll();
		return dishConnections.stream().filter(t->t.getName().equals(name)).collect(Collectors.toList());
	}

	@Override
	public String modifyDishConnection(DishConnection dishConnection) {
		
		DishConnection dishCon = dishConnectionRepo.save(dishConnection);
		if(dishCon!=null)
			return "SUCCESS";
		else
			return "FAIL";
	}

	@Override
	public List<DishConnection> findAllConnections() {
		return dishConnectionRepo.findAll();
	}

}
