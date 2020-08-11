package com.cg.scheduledprogramservice.service;


import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.cg.scheduledprogramservice.entity.ScheduleEntity;

public interface ScheduleService {
	
	public Iterable<ScheduleEntity> getAllSchedules();
	Optional<ScheduleEntity> getScheduleById(int id); //return typre doubt
	void addSchedule(ScheduleEntity schedule);
	void updateScheduleById(int id,ScheduleEntity schedule);
	void deleteSchedulebyId(int id);
	
	

}
