package in.java.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.java.bean.Product;
import in.java.config.AnnotationConfig;


public class Test {

	public static void main(String[] args) {
		
		//Starting the container and informing the configuration file to scan the spring-bean
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		
		Product product = applicationContext.getBean("getProdObj",Product.class);
		System.out.println(product);
		
		//closing the container
		((AbstractApplicationContext) applicationContext).close();
		

		
	}

}