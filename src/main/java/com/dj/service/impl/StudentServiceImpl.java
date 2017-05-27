package com.dj.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.dj.dao.spring.SpringStudentDao;
import com.dj.domain.Student;
import com.dj.service.StudentService;

import Exception.NoNumberException;

@Qualifier("StudentService")

@Service
public class StudentServiceImpl implements StudentService {
	private static Logger logger = LogManager.getLogger(StudentServiceImpl.class.getName());
    // 注入Service依赖 
    @Autowired
    private SpringStudentDao springStudentDao;
   
    public long insert(Student student){
		springStudentDao.insert(student);
		logger.info("StudentServiceImpl insert");
		return student.getId();	
    }
    
    public boolean update(Student student){
    	student.setUpdateAt(System.currentTimeMillis());
    	boolean bl = springStudentDao.update(student);
    	logger.info("");
    	return bl;
    	
    }
    public boolean delete(long id){
    	boolean bl =  springStudentDao.delete(id);
    	logger.info("StudentServiceImpl delete");
		return bl;    	
    }

    public int countAll() {
    	springStudentDao.countAll();
    	logger.info("StudentServiceImpl countAll");
		return springStudentDao.countAll();
	}
    public Student  findByStudentId(long id) throws NoNumberException{
    	Student student = springStudentDao.findByStudentId(id);
    	logger.info("StudentServiceImpl findByStudentId");
    	if(student != null){
				return student;	
			}else{
				throw new NoNumberException("不存在此id");
			}
    	}
		
	}

	
  

