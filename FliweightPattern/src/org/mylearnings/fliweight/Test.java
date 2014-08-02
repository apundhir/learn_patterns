package org.mylearnings.fliweight;

public class Test {
	public static void main(String[] args) {
		String names[] = {"Ajay", "Vinay", "Tarun"};
		int ids[] = {1001, 1002, 1003};
		int scores[] = {45, 60, 55};
		
		double total = 0;
		
		for(int index = 0; index< scores.length; index++){
			total += scores[index];
		}
		
		double avgScore = total / scores.length;
		
		Student student = new Student(avgScore);
		for(int index = 0; index< scores.length; index++){
			student.setName(names[index]);
			student.setId(ids[index]);
			student.setScore(scores[index]);
			
			System.out.println("Student: "+student.getName() + "Standing: "+Math.round(student.getStanding()));
		}
		
	}
	
}
