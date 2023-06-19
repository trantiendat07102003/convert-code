package Buoi09;


public class Employee {
	
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

	double getSalaryAfterCalculating() {
		if(this.age >= 16 && this.age <= 18) {
			return this.baseSalary + this.baseSalary*0.05;
		}else if(this.age <= 25) {
			return this.baseSalary + this.baseSalary*0.15;
		}else if(this.age <= 40) {
			return this.baseSalary + this.baseSalary*0.3;
		}else {
			return this.baseSalary + this.baseSalary*0.5;
		}
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
