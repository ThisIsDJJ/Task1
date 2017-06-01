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
// 告诉junit spring配置文件
@ContextConfiguration({"classpath:springDao.xml"})
public class SpringStudentTest {
	private static Logger logger = LogManager.getLogger(SpringStudentTest.class);
	@Autowired
	private SpringStudentDao springstudentDao ;
	@Test
	public void insertTest(){
		Student student = new Student();
		long insert =  springstudentDao.insert(student);
		logger.error("SpringStudentTest debug insertTest"+"insert="+insert);
	}
	@Test
	public void countAll(){
		logger.debug(springstudentDao.countAll());
	}
	@Test
	public void findByStudentId(){
		 Student student =springstudentDao.findByStudentId(3);
		 logger.debug(student);
	}
	@Test
	public void  update(){
		Student student = new Student();
		logger.debug(springstudentDao.update(student));
	}
	@Test
	public void delete(){
		logger.debug(springstudentDao.delete(1));
		
	}

}

