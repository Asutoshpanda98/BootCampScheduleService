package com.cg.scheduledprogramservice.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.scheduledprogramservice.entity.ScheduleEntity;
import com.cg.scheduledprogramservice.repository.ScheduleRepository;

@Service
public class ScheduleServiceImpl implements ScheduleService {

	
  @Autowired
 private ScheduleRepository scheduleRepository;
   
 
		

	@Override
	public Iterable<ScheduleEntity> getAllSchedules() {
	
		return scheduleRepository.findAll();
	}

	@Override
	public Optional<ScheduleEntity> getScheduleById(String id) {
	    return scheduleRepository.findById(id);
	}

	@Override
	public void addSchedule(ScheduleEntity scheduleEntity) {
	   scheduleRepository.save(scheduleEntity);
	}

	@Override
	public void updateScheduleById(String id,ScheduleEntity scheduleEntity) {
		// TODO Auto-generated method stub
		  scheduleRepository.save(scheduleEntity);
			}
	

	@Override
	public void deleteSchedulebyId(String id) {
		scheduleRepository.deleteById(id);
	}
	
	
	

}
