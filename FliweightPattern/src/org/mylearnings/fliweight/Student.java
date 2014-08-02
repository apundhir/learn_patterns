package org.mylearnings.fliweight;

public class Student {
	private String name;
	private int id;
	private double score;
	private double averageScore;
	
	public Student(double a) {
		this.averageScore = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public double getStanding(){
		return (score/ averageScore - 1.0) * 100.0;
	}
	
	
}
