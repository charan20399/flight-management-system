package com.sprint1.fms1.service;

import java.util.List;

import com.sprint1.fms1.model.ScheduleDetails;

public interface ViewDetailsService {
	public ScheduleDetails getFlightDetails(long id);
	public List<ScheduleDetails> getFlights();
}
