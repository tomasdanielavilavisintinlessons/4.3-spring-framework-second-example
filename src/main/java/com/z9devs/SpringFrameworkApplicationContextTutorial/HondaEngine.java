package com.z9devs.SpringFrameworkApplicationContextTutorial;

import org.springframework.stereotype.Component;

@Component
public class HondaEngine implements Engine
{
	public void run()
	{
		System.out.println("The Honda engine is running...");
	}
}
