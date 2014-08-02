package org.mylearnings.observer;

import java.util.*;

public class Database implements Publisher{
	private String operation;
	private String record;
	
	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getRecord() {
		return record;
	}

	public void setRecord(String record) {
		this.record = record;
	}

	private List<Observer> observersList;
	
	public Database() {
		observersList = new ArrayList<Observer>();
	}

	public List<Observer> getObserversList() {
		return observersList;
	}

	public void setObserversList(List<Observer> observersList) {
		this.observersList = observersList;
	}

	@Override
	public void registerObserver(Observer o) {
		observersList.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		observersList.remove(o);
		
	}                                                            

	@Override
	public void notifyObservers() {
		for (Observer o : observersList) {
			o.update(operation, record);
		}
		
	}

	public void editRecords(String operation, String record){
		this.operation = operation;
		this.record = record;
		notifyObservers();
	}
}
