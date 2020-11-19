package com.katu.demo;

public class Person {
	
	private String personName;
	private int personAge;
	private double personScore;
	
	
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personAge=" + personAge + ", personScore=" + personScore + "]";
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String personName, int personAge, double personScore) {
		super();
		this.personName = personName;
		this.personAge = personAge;
		this.personScore = personScore;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public double getPersonScore() {
		return personScore;
	}
	public void setPersonScore(double personScore) {
		this.personScore = personScore;
	}
	

}
