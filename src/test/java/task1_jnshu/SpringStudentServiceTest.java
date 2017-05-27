package task1_jnshu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dj.domain.Student;
import com.dj.service.StudentService;
import com.dj.service.impl.StudentServiceImpl;

import Exception.NoNumberException;

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:springDao.xml" ,"classpath:springservice.xml"})

public class SpringStudentServiceTest {
	
	@Autowired
	private StudentServiceImpl studentServiceImpl;
	@Test
	public void insertTest(){
		Student student = new Student(1,"小红","java",20170516,"华师",111,"11111","111",111,111);
		System.out.println(student);
		studentServiceImpl.insert(student);

	}
	@Test
	public void UpdateTest(){	
		Student student = new Student(1,"小黑","java",20170516,"华师",111,"11111","111",111,111);
		studentServiceImpl.update(student);
	}
	@Test
	public void deleteTest(){
		long id = 3;
		boolean b=studentServiceImpl.delete(id);
	
	}
	@Test
	public void selectAllTest(){
		
	}
	@Test
	public void countAllTest(){
		studentServiceImpl.countAll();
	}
	@Test
	public void findByStudentId(){
		long id = 23333;
		try {
			studentServiceImpl.findByStudentId(id);
		} catch (NoNumberException e) {
			System.out.println(e);
		}
	
	}
	
}
