package Buoi10;


public abstract class Employee {
	
	int id;
	String name;
	int age;
	int baseSalary;
	
	Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.baseSalary = 300;
	}

	abstract double getSalaryAfterCalculating();
	
	void action1() {
		System.out.println();
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
