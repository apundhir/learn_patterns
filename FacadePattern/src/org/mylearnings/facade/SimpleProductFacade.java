package org.mylearnings.facade;

public class SimpleProductFacade {
	DifficultProduct difficultProduct;
	
	public SimpleProductFacade() {
		difficultProduct = new DifficultProduct();
	}
	
	public void setName(String name){
		char chars[] = name.toCharArray();
		if(chars.length > 0){
			difficultProduct.setFirstNameChar(chars[0]);
		}
		if(chars.length > 1){
			difficultProduct.setSecondNameChar(chars[1]);
		}
		if(chars.length > 2){
			difficultProduct.setThirdNameChar(chars[2]);
		}
		if(chars.length > 3){
			difficultProduct.setFourthNameChar(chars[3]);
		}
		if(chars.length > 4){
			difficultProduct.setFifthNameChar(chars[4]);
		}
	}
	
	public String getName(){
		return difficultProduct.getName();
	}
}
