package com.cwa.spring.data.jpa.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.cwa.spring.data.jpa.entity.Guardian;
import com.cwa.spring.data.jpa.entity.Student;

@SpringBootTest
//@DataJpaTest
public class StudentRepositoryTest {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void saveStudent() {
		Student student = Student.builder().emailId("akshay@gmail.com").firtName("Akshay").lastName("Sarambale")
//				.guardianName("Anand").guardianEmail("anand@gmail.com").guardianMobile("1234567890")
				.build();
		
		studentRepository.save(student);
	}
	
	@Test
	public void saveStudentWithGuardian() {
		
		Guardian guardian = Guardian.builder()
				.email("anand@gmail.com").name("Anand").mobile("123456789")
				.build();
		
		Student student = Student.builder()
				.firtName("Shiv").emailId("shiv@gmail.com").lastName("Kumar")
				.guardian(guardian)
				.build();
		
		studentRepository.save(student);
	}
	
	@Test
	public void printAllStudent() {
		List<Student> studentList = studentRepository.findAll();	
		System.out.println("studentList = " + studentList);
	}
	
	@Test
	public void printStudentByFirstName() {
		List<Student> students = studentRepository.findByFirstName("Shiv");
		System.out.println("students = " + students);
	}
	
	@Test
	public void printStudentByFirstNameContaining() {
		List<Student> students = studentRepository.findByFirstNameContaining("Sh");
		System.out.println("students = " + students);
	}
	
	@Test
	public void printStudentBasedOnGuardianName() {
		List<Student> students = studentRepository.findByGuardianName("Anand");
		System.out.println("students = " + students);
		
	}
	
	@Test
	public void printgetStudentByEmailAddress() {
		Student student = studentRepository.getStudentByEmailAddress("akshay@gmail.com");
		System.out.println("student = " + student);
	}
	
	@Test
	public void printgetStudentFirstNameByEmailAddress() {
		String firstName = studentRepository.getStudentFirstNameByEmailAddress("akshay@gmail.com");
		System.out.println("firstName = " + firstName);
	}
	
	@Test
	public void printgetStudentFirstNameByEmailAddressNative() {
		Student student = studentRepository.getStudentByEmailAddressNative("anand@gmail.com");
		System.out.println("student = " + student);
	}
	
	@Test
	public void printgetStudentByEmailAddressNativeNamedParam() {
		Student student = studentRepository.getStudentByEmailAddressNativeNamedParam("anand@gmail.com");
		System.out.println("student = " + student);	
	}
	
	@Test
	public void updateStudentNameByEmailId() {
		studentRepository.updateStudentNameByEmailId("akshay sarambale", "akshay@gmail.com");	
	}
}
