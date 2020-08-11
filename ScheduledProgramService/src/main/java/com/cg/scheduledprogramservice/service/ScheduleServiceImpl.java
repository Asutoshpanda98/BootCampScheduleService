package com.cg.scheduledprogramservice.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.RecoverableDataAccessException;
import org.springframework.dao.TransientDataAccessException;
import org.springframework.jdbc.datasource.init.ScriptException;
import org.springframework.stereotype.Service;

import com.cg.scheduledprogramservice.entity.ScheduleEntity;
import com.cg.scheduledprogramservice.exception.CrudException;
import com.cg.scheduledprogramservice.repository.ScheduleRepository;

@Service
public class ScheduleServiceImpl implements ScheduleService {

	
  @Autowired
 private ScheduleRepository scheduleRepository;
   
 
    private String dataAccessException = "distributed transaction exception!";
	private String scriptException = "Not well-formed script or error SQL command exception!";
	private String transientDataAccessException = "database timeout! exception!";

	@Override
	public Iterable<ScheduleEntity> getAllSchedules() {
	try {
		return scheduleRepository.findAll();
	}
	catch (RecoverableDataAccessException  e) {
		
		throw new CrudException(dataAccessException);
	} catch (ScriptException  e) {
		
		throw new CrudException(scriptException);
		
	} catch (TransientDataAccessException e) {
		
		throw new CrudException(transientDataAccessException);
	}
	}

	

	@Override
	public void addSchedule(ScheduleEntity scheduleEntity) {
		try {
	   scheduleRepository.save(scheduleEntity);
		}
        catch (RecoverableDataAccessException  e) {
			
			throw new CrudException(dataAccessException);
		} catch (ScriptException  e) {
			
			throw new CrudException(scriptException);
			
		} catch (TransientDataAccessException e) {
			
			throw new CrudException(transientDataAccessException);
		}
	}

	@Override
	public void updateScheduleById(int id,ScheduleEntity scheduleEntity) {
		try {
		
		  scheduleRepository.save(scheduleEntity);
		}catch (RecoverableDataAccessException  e) {
			
			throw new CrudException(dataAccessException);
		} catch (ScriptException  e) {
			
			throw new CrudException(scriptException);
			
		} catch (TransientDataAccessException e) {
			
			throw new CrudException(transientDataAccessException);
		}
		
			}
	

//	@Override
//	public void deleteSchedulebyId(int id) {
//		try {
//		scheduleRepository.deleteById(id);
//		}
//        catch (RecoverableDataAccessException  e) {
//			
//			throw new CrudException(dataAccessException);
//		} catch (ScriptException  e) {
//			
//			throw new CrudException(scriptException);
//			
//		} catch (TransientDataAccessException e) {
//			
//			throw new CrudException(transientDataAccessException);
//		}
//	}
//


	@Override
	public Optional<ScheduleEntity> getScheduleById(int id) {
		// TODO Auto-generated method stub
		return scheduleRepository.findById(id);
	}



@Override
public void deleteSchedulebyId(int id) {
	scheduleRepository.deleteById(id);
	
}
	
	
	

}
