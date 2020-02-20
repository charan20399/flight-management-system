package com.sprint1.fms1.dao;

import java.util.List;

import com.sprint1.fms1.model.ScheduleDetails;

public interface ViewDetailsDao {
 public ScheduleDetails getFlightDetails(long id);
 public List<ScheduleDetails> getFlights();
}
