package com.example.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Flight {
	
	private int flightNumber;
	private String airline;
	private String sourceCity;
	private String targetCity;
	private LocalDateTime flightDepartureTime;
	private LocalDateTime flightArrivalTime;
	
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getSourceCity() {
		return sourceCity;
	}
	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}
	public String getTargetCity() {
		return targetCity;
	}
	public void setTargetCity(String targetCity) {
		this.targetCity = targetCity;
	}
	public LocalDateTime getFlightDepartureTime() {
		return flightDepartureTime;
	}
	public void setFlightDepartureTime(LocalDateTime flightDepartureTime) {
		this.flightDepartureTime = flightDepartureTime;
	}
	public LocalDateTime getFlightArrivalTime() {
		return flightArrivalTime;
	}
	public void setFlightArrivalTime(LocalDateTime flightArrivalTime) {
		this.flightArrivalTime = flightArrivalTime;
	}
}
