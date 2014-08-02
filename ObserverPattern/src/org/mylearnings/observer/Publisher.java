package org.mylearnings.observer;
/*
 * This is also known as the Subject.
 */
public interface Publisher {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
