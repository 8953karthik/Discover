package com.discover.program4.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.discover.program4.Entity.Car;
@Repository
public interface ICarDao {

	public int addcar(Car car);
	public int deletecar(String name);
	public List<Car> listofcars();
}
