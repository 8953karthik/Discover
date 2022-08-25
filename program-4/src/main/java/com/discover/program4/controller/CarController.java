package com.discover.program4.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.discover.program4.Entity.Car;
import com.discover.program4.service.ICarService;

@RestController
@RequestMapping("/car")
public class CarController {
	
	@Autowired
	private ICarService carService;
	

	@PostMapping("/addcar")
	public ResponseEntity<Object> saveCustomer(@RequestBody Car car) {
		System.out.println("Car Added");
			return new ResponseEntity<>(carService.addcar(car), HttpStatus.CREATED);
	}
	
	
	@DeleteMapping("/deletecar/{name}")
	public ResponseEntity <Integer> deletecar(@Valid @PathVariable String name)
	{
		return new ResponseEntity<> (carService.deletecar(name),HttpStatus.OK);	
	}
	
	@GetMapping("/getallcars")
	public ResponseEntity<List<Car>> listofcars()
	{
		return new ResponseEntity<>(carService.listofcars(),HttpStatus.OK);
		
	}
	

}
