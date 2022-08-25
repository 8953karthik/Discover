package com.discover.program4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.discover.program4.Entity.Car;
import com.discover.program4.dao.ICarDao;

@Service

public class ICarServiceImpl implements ICarService {

	@Autowired
	private ICarDao cardao;
	
	@Override
	public int addcar(Car car) {
		// TODO Auto-generated method stub
		return cardao.addcar(car);
	}

	

	@Override
	public int deletecar(String name) {
		// TODO Auto-generated method stub
		return cardao.deletecar(name);
	}

	@Override
	public List<Car> listofcars() {
		// TODO Auto-generated method stub
		return cardao.listofcars();
	}

}
