package com.z9devs.SpringFrameworkApplicationContextTutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// Con questa annotazione posso utilizzare AppConfig senza dover
// creare i metodi per la creazione dei bean
@Component
public class Car 
{
	@Autowired
	// Con l'annotazione @Qualifier specifico quale delle implementazioni di
	// Engine utilizzare
	@Qualifier("hondaEngine")
	Engine engine;
	public void drive()
	{
		engine.run();
		System.out.println("Sto guidando...");
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
}