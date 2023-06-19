package Buoi09;


public class PartTime extends Employee {
	
	int level;
	
	PartTime(int id, String name, int age, int level) {
		super(id, name, age);
		this.level = level;
	}
	
	@Override
	double getSalaryAfterCalculating() {
		if(this.level <= 5) {
			return super.getSalaryAfterCalculating() + super.getSalaryAfterCalculating()*0.02;
		}else if(this.level <= 7) {
			return super.getSalaryAfterCalculating() + super.getSalaryAfterCalculating()*0.05;
		}else if(this.level <= 10) {
			return super.getSalaryAfterCalculating() + super.getSalaryAfterCalculating()*0.15;
		}else {
			return super.getSalaryAfterCalculating() + super.getSalaryAfterCalculating()*0.35;
		}
	}
	
	@Override
	public String toString() {
		return "PartTime [id=" + id + ", name=" + name + ", age=" + age + ", level=" + level + "]";
	}

}
