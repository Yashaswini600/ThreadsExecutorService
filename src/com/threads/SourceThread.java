package com.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SourceThread {
	
public static void main(String[] args) {
			System.out.println("Start");
			
			
			ExecutorService execService = Executors.newFixedThreadPool(10);
			
			execService.execute(new TargetThread());
			execService.execute(new TargetThread());
			execService.execute(new TargetThread());
			execService.execute(new TargetThread());
			execService.execute(new TargetThread());
			execService.execute(new TargetThread());
			execService.execute(new TargetThread());
			execService.execute(new TargetThread());
			execService.execute(new TargetThread());
			execService.execute(new TargetThread());
			
			execService.shutdown();

			System.out.println("End");
			

		}

	}
