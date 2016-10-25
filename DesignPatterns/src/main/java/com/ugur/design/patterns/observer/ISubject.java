package com.ugur.design.patterns.observer;

public interface ISubject {

	public void registerObserver(IObserver observer);
	public void removeObserver(IObserver observer);
	public void noifyObserver();


}
