package com.ugur.design.patterns.singleton;

public class AppOfSingleton {
	
	public static void main(String[] args) {
		
		PerformanceStage performanceStage = PerformanceStage.getInstance(); 
		
		PerformanceStage performanceStage2 = PerformanceStage.getInstance(); 
		
		PerformanceStage performanceStage3 = PerformanceStage.getInstance(); 

		if(performanceStage2 == performanceStage &&  performanceStage2 == performanceStage3){
			System.out.println("Singleton works as expected");
		}
	}

}
