package com.ugur.yeter.lesson_2.home_work2;

public abstract class ElectronicSmartTool {
	
	public ElectronicSmartTool() {
		assembly();
		testing();
		packaging();
		storage();
	}
	
	public abstract void assembly();
	public abstract void testing();
	public abstract void packaging();
	public abstract void storage();


}
