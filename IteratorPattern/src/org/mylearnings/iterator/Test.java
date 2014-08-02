package org.mylearnings.iterator;

public class Test {

	private Division division;
	private DivisionIterator iterator;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test t = new Test();

	}

	public Test(){
		division = new Division("sales");
		
		division.add("bob");
		division.add("alice");
		
		iterator = division.iterator();
		while(iterator.hasNext()){
			VP vp = (VP) iterator.next();
			vp.print();
		}
	}
}
