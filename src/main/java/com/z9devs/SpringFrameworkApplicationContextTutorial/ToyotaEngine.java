package com.z9devs.SpringFrameworkApplicationContextTutorial;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// Con l'annotazione @Primary specifico, se ci sono più implementazioni
// della stessa interfaccia, quale preferire quando faccio injection
//@Primary
public class ToyotaEngine implements Engine 
{
	public void run() 
	{
		System.out.println("The Toyota engine is running...");
	}
}
