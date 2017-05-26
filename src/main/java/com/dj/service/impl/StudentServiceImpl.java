package com.dj.service.impl;
import java.util.List;

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
    	boolean bl = springStudentDao.update(student);
    	logger.info(" 原来如此哦  传入的是创造对象的那个类 ---nonono不影响  StudentServiceImpl update");
    	return bl;
    	
    }
    public boolean delete(long id){
    	boolean bl =  springStudentDao.delete(id);
    	logger.info("StudentServiceImpl delete");
		return bl;    	
    }
    public List<Student> selectAll(){
    	springStudentDao.selectAll();
    	logger.info("StudentServiceImpl selectAll");
		return null;
	}
    public int countAll() {
    	springStudentDao.countAll();
    	logger.info("StudentServiceImpl countAll");
		return springStudentDao.countAll();
	}
    public Student  findByStudentId(long id) {
    	Student student = springStudentDao.findByStudentId(id);
    	logger.info("StudentServiceImpl findByStudentId");
    	if(student != null){
				return student;	
			}else{
				throw new NoNumberException("不存在此id");
			}
    	}
		
	}

	
  

