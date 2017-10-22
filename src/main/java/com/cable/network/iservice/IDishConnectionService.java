package com.cable.network.iservice;

import java.util.List;

import com.cable.network.domain.DishConnection;

public interface IDishConnectionService {
	public String addConnection(DishConnection connection);
	public DishConnection findByConnectionId(String connectionId);
	public List<DishConnection> findByName(String name);
	public String modifyDishConnection(DishConnection dishConnection);
	public List<DishConnection> findAllConnections();
}
