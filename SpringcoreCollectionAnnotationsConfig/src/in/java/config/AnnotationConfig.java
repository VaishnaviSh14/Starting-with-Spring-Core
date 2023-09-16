package in.java.config;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.java.bean.Product;

@Configuration
public class AnnotationConfig {
	
	static {
		System.out.println("AnnotationConfig.class file is loading...");
	}

	@Bean
	public Product getProdObj() {
		System.out.println("AppConfig.getProdObj()");
		
		Product product = new Product();
		
		product.setData(list());
		product.setModels(set());
		product.setModes(map());
		product.setContext(props());
		
		return product;
		
	}
	
	private Map<Integer, String> map() {
		Map<Integer,String> hm = new HashMap<>();
		hm.put(10000,"fossil");
		hm.put(20000, "tissot");
		hm.put(30000, "omega");
		
		return hm;
	}

	private Set<String> set() {
		Set<String> hs = new LinkedHashSet<>();
		hs.add("chronography");
		hs.add("digital");
		hs.add("analog");

		return hs;
	}

	private List<String> list(){
		LinkedList<String> l1 =new LinkedList<>();
		l1.add("fossil");
		l1.add("tissot");
		l1.add("omega");
		return l1;
	}
	
	public Properties props(){
        Properties properties = new Properties();
        properties.put("GRM", "Fossil");   
        properties.put("CHINA", "Tissot");
        properties.put("USA", "Omega");
        
        return properties;

	}
}
