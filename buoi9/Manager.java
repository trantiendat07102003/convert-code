package Buoi09;


public class Manager extends Employee {
	
	String type;
	
	Manager(int id, String name, int age, String type) {
		super(id, name, age);
		this.type = type;
	}

	@Override
	double getSalaryAfterCalculating() {
		if(this.type.equals("ABC")) {
			return super.getSalaryAfterCalculating() + super.getSalaryAfterCalculating()*0.25;
		}else if(this.type.equals("XYZ")) {
			return super.getSalaryAfterCalculating() + super.getSalaryAfterCalculating()*0.4;
		}else {
			return super.getSalaryAfterCalculating() + super.getSalaryAfterCalculating()*0.15;
		}
	}
	
	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", age=" + age + ", type=" + type + "]";
	}

}
