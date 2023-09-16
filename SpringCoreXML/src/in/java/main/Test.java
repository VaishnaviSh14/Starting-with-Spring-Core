package in.java.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		
		//Starting the container and informing the configuration file to scan the spring-bean
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		((AbstractApplicationContext) applicationContext).close();
		

		
	}

}