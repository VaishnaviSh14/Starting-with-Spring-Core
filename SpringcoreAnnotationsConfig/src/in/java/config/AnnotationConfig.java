package in.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.java.bean.Student;

@Configuration
public class AnnotationConfig {
	
	static {
		System.out.println("AnnotationConfig.class file is loading...");
	}
	
	@Bean
	public Student studObj() {
		System.out.println("AnnotationConfig.studObj()");
		Student student = new Student();
		student.setSid(14);
		student.setSname("Vaishnavi");
		student.setSaddress("France");
		student.setSage(20);
		
		return student;

		
	}

}
