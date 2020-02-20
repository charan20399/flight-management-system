package com.sprint1.fms1.service;

import java.util.List;

import com.sprint1.fms1.dao.ViewDetailsDao;
import com.sprint1.fms1.dao.ViewDetailsDaoImpl;
import com.sprint1.fms1.model.ScheduleDetails;

public class ViewDetailsServiceImpl implements ViewDetailsService {
	ViewDetailsDao view=new ViewDetailsDaoImpl();
	@Override
	public ScheduleDetails getFlightDetails(long id) {
		
		return view.getFlightDetails(id);
	}
	@Override
	public List<ScheduleDetails> getFlights() {
		
		return view.getFlights();
	}

}
