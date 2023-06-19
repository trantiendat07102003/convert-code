package Buoi09;


public class Student {
	
	int id;
	String name;
	int age;
	
	Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
        return "Student [Mã số: " + this.id + 
        	   ", Tên: " + this.name + 
        	   ", Tuổi: " + this.age + "]";
    }

}
