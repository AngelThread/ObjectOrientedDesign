package com.ugur.yeter.lesson_2.home_work2.client;

import com.ugur.yeter.lesson_2.home_work2.ElectronicSmartTool;
import com.ugur.yeter.lesson_2.home_work2.SmartPhone;
import com.ugur.yeter.lesson_2.home_work2.Tablet;

public class SampleFactory {
	
	
	public static void main(String[] args) {
		ElectronicSmartTool phone = new SmartPhone();
		phone.launchProcess();

		ElectronicSmartTool tablet = new Tablet();
		tablet.launchProcess();

	}

}
