package springAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration 
//instead of xml using test config to config spring bean

public class TestConfig {
	
	@Bean
	public Engine getEngine() {
		return new Engine();
	}
	
	@Bean
	public Car getCar() {
		return new Car();
	}

	
	
}
