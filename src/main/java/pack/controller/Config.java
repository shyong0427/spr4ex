package pack.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pack.model.Gugudan;

@Configuration
public class Config {
	@Bean
	public MyProcess myProcess() {
		MyProcess process = new MyProcess();
		process.setName("DR");
		process.setDan(78);
		process.setGugudan(gugudan());
		
		return process;
	}
	
	@Bean
	public Gugudan gugudan() {
		return new Gugudan();
	}
}