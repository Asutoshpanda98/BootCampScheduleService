package com.cg.scheduledprogramservice.service;

import java.util.List;
import java.util.Optional;

import com.cg.scheduledprogramservice.entity.ScheduleEntity;

public interface ScheduleService {
	
	public Iterable<ScheduleEntity> getAllSchedules();
	Optional<ScheduleEntity> getScheduleById(String id); //return typre doubt
	void addSchedule(ScheduleEntity schedule);
	void updateScheduleById(String id,ScheduleEntity schedule);
	void deleteSchedulebyId(String id);
	

}
