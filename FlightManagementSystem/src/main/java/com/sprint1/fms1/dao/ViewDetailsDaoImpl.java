package com.sprint1.fms1.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.sprint1.fms1.model.ScheduleDetails;

public class ViewDetailsDaoImpl implements ViewDetailsDao {
	
	Map<Long, ScheduleDetails> flightScheduleList=new HashMap<>();
	//To get the id based flight schedule details.
	public ViewDetailsDaoImpl() {
		
		ScheduleDetails sd1=new ScheduleDetails(11213L, "Bangalore", "Chennai", 200, "15:30", "17:30");	
		ScheduleDetails sd2=new ScheduleDetails(11256L, "Hyderabad", "Delhi", 300, "11:30", "12:30");
		ScheduleDetails sd3=new ScheduleDetails(15262L, "kolkata", "Delhi", 250, "10:30", "11:30");
		ScheduleDetails sd4=new ScheduleDetails(11251L, "america", "Delhi", 450, "9:50", "10:30");
		ScheduleDetails sd5=new ScheduleDetails(11255L, "dubai", "Delhi", 433, "10:30", "11:00");
		flightScheduleList.put(sd1.getId(), sd1);
		flightScheduleList.put(sd2.getId(), sd2);
		flightScheduleList.put(sd3.getId(), sd3);
		flightScheduleList.put(sd4.getId(), sd4);
		flightScheduleList.put(sd5.getId(), sd5);
			
	}
	public ScheduleDetails getFlightDetails(long id) {
		ScheduleDetails s=flightScheduleList.get(id);
		return s;
		
	}
	@Override
	//To get the list all listed flights.
	public List<ScheduleDetails> getFlights() {
		List<ScheduleDetails> f= new ArrayList<ScheduleDetails>();
		for(Long sd:flightScheduleList.keySet())
		{	
				f.add(flightScheduleList.get(sd));
		}
		return f;
	}

}
