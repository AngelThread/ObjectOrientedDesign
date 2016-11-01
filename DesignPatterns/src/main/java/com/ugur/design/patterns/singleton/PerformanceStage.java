package com.ugur.design.patterns.singleton;
//it has only a private constructor!
public class PerformanceStage {
	private static PerformanceStage performanceStage = null;
	
	
	private PerformanceStage(){
		

	}

	public static PerformanceStage getInstance(){
		if (performanceStage == null){
			performanceStage = new PerformanceStage();
			return performanceStage;
		}
		return performanceStage;		
	}
}
