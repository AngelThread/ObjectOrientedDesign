package com.ugur.yeter.lesson_2.home_work2;

public abstract class ElectronicSmartTool {
	
	public ElectronicSmartTool() {
		
	}
	//Template method
	public void launchProcess()
	{
		assembly();
		testing();
		packaging();
		storage();
	}
	
	
	protected abstract void assembly();
	protected abstract void testing();
	protected abstract void packaging();
	protected abstract void storage();


}
