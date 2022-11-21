package com.z9devs.SpringFrameworkApplicationContextTutorial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Con questa annotazione diciamo che la classe è responsabile
// della configurazione, al posto di un file xml. Ora è 
// questa classe responsabile di dare gli oggetti
@Configuration
// @ComponentScan viene utilizzata quando uso l'annotazione 
// @Component nelle classi, anziché usare qui i metodi @Bean
@ComponentScan(basePackages="com.z9devs.SpringFrameworkApplicationContextTutorial")
public class AppConfig {
	// Con questa annotazione invece specifico che si tratta di
	// un bean
	/*
	@Bean
	public Car getCar() {
		return new Car();
	}

	@Bean
	public Engine getEngine() {
		return new HondaEngine();
	}
	*/
	
	// Posso fare la stessa cosa senza però usare i metodi visti 
	// sopra, utilizzando l'annotazione @Component direttamente 
	// sui bean
}
