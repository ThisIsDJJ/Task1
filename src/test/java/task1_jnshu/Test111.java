package task1_jnshu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.dj.dao.spring.SpringStudentDao;
import com.dj.domain.Student;
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:springDao.xml" ,"classpath:springservice.xml"})
public class Test111 {	
	private static Logger logger = LogManager.getLogger(Test111.class);
	@Autowired
	private SpringStudentDao springstudentDao ;
	@Test
	public void deleteTest(){
		springstudentDao.delete(2);
		logger.error("InsertTest 删除id为2的学生");
	}
	@Test
	public void insertStudent(){
	Student student = new Student(1,"小白","java",20170516,"hust",111,"11111","111",111,111);
	for(int i = 0;i<=100;i++){
		springstudentDao.insert(student);
		}
	logger.debug("循环插入学生");
	}

	
}
