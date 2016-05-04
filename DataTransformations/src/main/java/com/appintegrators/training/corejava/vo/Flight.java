package com.appintegrators.training.corejava.vo;

public class Flight {
	private String airlineName;
	private String planeType;
	private String departureDate;
	private String flightCode;
	private String origination;
	private String destination;
	private int availableSeats;
	private int price;

	public Flight() {
		super();
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getPlaneType() {
		return planeType;
	}

	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getFlightCode() {
		return flightCode;
	}

	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}

	public String getOrigination() {
		return origination;
	}

	public void setOrigination(String origination) {
		this.origination = origination;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Flight [airlineName=" + getAirlineName() + ", planeType="
				+ getPlaneType() + ", departureDate=" + getDepartureDate()
				+ ", flightCode=" + getFlightCode() + ", origination="
				+ getOrigination() + ", destination=" + getDestination()
				+ ", availableSeats=" + getAvailableSeats() + ", price="
				+ getPrice() + "]";
	}
}
