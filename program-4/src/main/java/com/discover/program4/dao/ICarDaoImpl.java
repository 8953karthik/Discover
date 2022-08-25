package com.discover.program4.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.discover.program4.Entity.Car;

@Repository

public class ICarDaoImpl implements ICarDao{

	@Autowired
	private JdbcTemplate template;
	
	@Override
	public int addcar(Car car) {
		// TODO Auto-generated method stub
		String sqladdcar="INSERT INTO Car_table (amount, name, color) VALUES ('"+car.getAmount()+"', '"+car.getName()+"', '"+car.getColor()+"')";
		return template.update(sqladdcar);
	}

	

	@Override
	public int deletecar(String name) {
		String sqlremovecar="DELETE FROM Car_table WHERE name= ?";
			return template.update(sqlremovecar,name);
	}

	@Override
	public List<Car> listofcars() {
		String all="SELECT * FROM Car_table";
		return template.query(all,BeanPropertyRowMapper.newInstance(Car.class));
	}

}
