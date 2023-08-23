package entities;

public class Student {
	public String name;
	public double note1;
	public double note2;
	public double note3;
	
	public double finalGrade() {
		return note1 + note2 + note3;
	}
	
	public double missing() {
		return 60 - finalGrade();
	}
	
	public String toString() {
		if (finalGrade() >= 60) {
			return "FINAL GRADE = " + String.format("%.2f%n", finalGrade()) 
			+ "PASS" ;
		} else {
			return "FINAL GRADE = " + String.format("%.2f%n", finalGrade()) 
			+ String.format("FAILED %n") + "MISSING " + String.format("%.2f", missing()) + " POINTS" ;
		}
	}
	
	
}
