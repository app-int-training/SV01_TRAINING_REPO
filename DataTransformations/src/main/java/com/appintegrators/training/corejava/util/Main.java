package com.appintegrators.training.corejava.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

import com.appintegrators.training.corejava.vo.Flight;

public class Main implements Callable {
	@SuppressWarnings("rawtypes")
	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		MuleMessage message = eventContext.getMessage();
		Object obj = message.getPayload();
		StringBuilder sb = new StringBuilder();
		List<Flight> arr = new ArrayList<Flight>();
		@SuppressWarnings("unchecked")
		List<Map> resultList = (List<Map>) obj;
		for (Map rowMap : resultList) {
			String airLineName = (String)rowMap.get("airlineName");
			String planeType=(String)rowMap.get("planeType");
			String departureDate=(String)rowMap.get("departureDate");
			String flightCode=(String)rowMap.get("flightCode");
			String origination=(String)rowMap.get("origination");
			String destination=(String)rowMap.get("destination");
			int availableSeats=(int)rowMap.get("availableSeats");
			int price=(int)rowMap.get("price");
			Flight flightObj = new Flight();
			flightObj.setAirlineName(airLineName);
			flightObj.setPlaneType(planeType);
			flightObj.setDepartureDate(departureDate);
			flightObj.setFlightCode(flightCode);
			flightObj.setOrigination(origination);
			flightObj.setDestination(destination);
			flightObj.setAvailableSeats(availableSeats);
			flightObj.setPrice(price);
			arr.add(flightObj);
			sb.append(flightObj);
		}
		return sb.toString();
	}

}
