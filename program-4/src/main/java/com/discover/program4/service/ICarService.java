package com.discover.program4.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.discover.program4.Entity.Car;
@Service
public interface ICarService {
	public int addcar(Car car);
	public int deletecar(String name);
	public List<Car> listofcars();
}
