package Buoi10;

public class FullTime extends PartTime {
	
	int expYear;
	double bonus;
	
	FullTime(int id, String name, int age, int level, int expYear, double bonus) {
		super(id, name, age, level);
		this.expYear = expYear;
		this.bonus = bonus;
	}
	
	@Override
	double getSalaryAfterCalculating() {
		return super.getSalaryAfterCalculating() + this.bonus*super.getSalaryAfterCalculating();
	}
	
	@Override
	public String toString() {
		return "FullTime [id=" + id + ", name=" + name + ", age=" + age + 
				", level=" + level + ", expYear=" + expYear + ", bonus=" + bonus + "]";
	}

}
