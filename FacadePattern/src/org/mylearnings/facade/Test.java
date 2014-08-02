package org.mylearnings.facade;

public class Test {

	public static void main(String[] args) {
		DifficultProduct difficultProduct = new DifficultProduct();
		difficultProduct.setFirstNameChar('A');
		difficultProduct.setSecondNameChar('B');
		difficultProduct.setThirdNameChar('C');
		difficultProduct.setFourthNameChar('D');
		difficultProduct.setFifthNameChar('E');
		System.out.println(difficultProduct.getName());
		
		SimpleProductFacade simple = new SimpleProductFacade();
		simple.setName("ABCDE");
		System.out.println(simple.getName());
		
	}

}
