package kh.lclass.oop.sample;

public class Student extends Person{
	
	//Field
	private String name;
/*	private int age;
	private char gender; */
	private int score;
	private int grade;
		
	//Constructor
	
	public Student() {
		super("김말똥", 22,'남');
	}
	
	public Student(String name, char gender, int age, int grade) {
		super(name, age, gender);
		this.name = name;
		this.grade = grade;
	}
	//Method
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + ", grade=" + grade + "]";
	}

	
	public String getName() {
		return this.name;
	}
	
	
	public int getAge() {
		return super.getAge() + 1;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public void setName(String name) {
		this.name = name;
	}
	
}
