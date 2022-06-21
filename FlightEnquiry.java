package com.example.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enquiry")
public class FlightEnquiry {
	List<Flight> flightList = new ArrayList<Flight>();
	
	public FlightEnquiry() {
		System.out.println("Flight ctor called.........");
		Flight theFlight1 = new Flight();
		Flight theFlight2 = new Flight();
		Flight theFlight3 = new Flight();
		
		theFlight1.setFlightNumber(101);
		theFlight1.setAirline("AIR INDIA");
		theFlight1.setSourceCity("BOMBAY");
		theFlight1.setTargetCity("LUCKNOW");
		theFlight1.setFlightArrivalTime(LocalDateTime.of(2022,06,29,12,30));
		theFlight1.setFlightArrivalTime(LocalDateTime.of(2022,06,29,14,45));
		
		theFlight2.setFlightNumber(105);
		theFlight2.setAirline("INDIGO");
		theFlight2.setSourceCity("BOMBAY");
		theFlight2.setTargetCity("LUCKNOW");
		theFlight2.setFlightArrivalTime(LocalDateTime.of(2022,06,29,12,30));
		theFlight2.setFlightArrivalTime(LocalDateTime.of(2022,06,29,14,45));
		
		theFlight3.setFlightNumber(110);
		theFlight3.setAirline("VISTARA");
		theFlight3.setSourceCity("BOMBAY");
		theFlight3.setTargetCity("LUCKNOW");
		theFlight3.setFlightArrivalTime(LocalDateTime.of(2022,06,29,12,30));
		theFlight3.setFlightArrivalTime(LocalDateTime.of(2022,06,29,14,45));
		
		
		flightList.add(theFlight1);
		flightList.add(theFlight2);
		flightList.add(theFlight3);
	}
	
	@RequestMapping("/greet")
	public String greeting() {
		return "<h1>Greeting to flight enquiry</h1>";
	}
	@RequestMapping("/welcome")
	public String greeting1() {
		return "<h1>Greeting from flight enquiry</h1>";
	}
	@RequestMapping("/bye")
	public String greeting2() {
		return "<h1>Bye from flight enquiry</h1>";
	}
	@GetMapping("/getFlight")
	public Flight getSingleFlightObject() {
		Flight theFlight = new Flight();
		theFlight.setFlightNumber(101);
		theFlight.setAirline("AIR INDIA");
		theFlight.setSourceCity("BOMBAY");
		theFlight.setTargetCity("LUCKNOW");
		theFlight.setFlightArrivalTime(LocalDateTime.of(2022,06,29,12,30));
		theFlight.setFlightArrivalTime(LocalDateTime.of(2022,06,29,14,45));
		return theFlight;
	}
	@GetMapping("/getAllFlight")
	public List<Flight> getAllFlightObject() {
		
		
		return flightList;
	}
	
	@GetMapping("/getFlight/{fid}")
	public Flight getFlightObject(@PathVariable("fid") int flightNumber)
	{
		Flight tempFlight = null;
		System.out.println("");
		for (Flight flight: flightList) {
			if(flight.getFlightNumber()==flightNumber) {
				tempFlight =flight;
				break;
			}
		}
		return tempFlight;
	}
	@PostMapping("/addFlight")
	public ResponseStatus addFlightObject(@RequestBody Flight flightObj)
	{
		System.out.println("add flight object()......");
		flightList.add(flightObj);
		ResponseStatus rep = new ResponseStatus();
		rep.setMsg("Flight added successfully.....");
		return rep;
	}
	@PutMapping("/modifyFlight")
	public ResponseStatus modifyFlightObject(@RequestBody Flight flightObj)
	{
		System.out.println("add flight object()......");
		boolean found = false;
		for (int i = 0; i < flightList.size(); i++) {
			Flight temFlight = flightList.get(i);
			if(temFlight.getFlightNumber()==flightObj.getFlightNumber()) {
				flightList.remove(i);
				flightList.add(flightObj);
				found=true;
				break;
			}
			
		}
		ResponseStatus rep = new ResponseStatus();
		if(found== true) {
		rep.setMsg("Flight modified successfully.....");
		}
		else {
			rep.setMsg("Flight not found.....");
		}
		return rep;
	}
}
