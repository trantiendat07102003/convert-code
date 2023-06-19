package Buoi10;
import java.util.ArrayList;


public class ManagementSystem implements ManagementSystemVersion2, ManagementSystemSkeletion {

	ArrayList<Employee> list;
	
	public ManagementSystem() {
		this.list = new ArrayList<Employee>();
	}
	
	@Override
	public void create(Employee e) {
		this.list.add(e);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void edit(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showAll() {
		for(Employee e : this.list) {
			System.out.println(e);
		}
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void filter() {
		// TODO Auto-generated method stub
		
	}

	
	
}
