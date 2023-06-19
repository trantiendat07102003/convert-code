package Buoi09;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// Employee
		// Manager
		// FullTime
		// PartTime
//		Student s = new Student(1, "Thành", 20);
//		System.out.println(s);
//		Object obj;
//		obj = new String("ABC");
//		System.out.println(obj);
//		obj = new Student(1, "Thành", 20);
//		System.out.println(obj);
//		ArrayList<Object> list = new ArrayList<Object>();
//		list.add(new String("Hello world!"));
//		list.add(new Student(1, "Thành", 29));
//		list.add(new Integer(10));
//		for(Object o : list) {
//			System.out.println(o);
//		}
		/*
		 * Việc truy cập thành phần của 1 obj phụ thuộc vào kiểu dữ liệu mà obj đó được khai báo.
		 * Khi truy cập đến các method của đối tượng đa hình thì nó sẽ ưu tiên cho các method đã được ghi đè bởi class con.
		 */
//		Object obj;
//		obj = new Student(1, "Thành", 20);
//		System.out.println(obj.toString());
//		Employee e;
//		e = new FullTime(1, "Thành", 20, 5, 2, 0.15);
//		System.out.println(((FullTime)e).bonus);  // Down casting
//		ArrayList<Employee> list = new ArrayList<Employee>();
//		list.add(new Employee(1, "A", 20));  // 0
//		list.add(new FullTime(2, "B", 23, 5, 3, 0.15));  // 1
//		list.add(new PartTime(3, "C", 22, 3));  // 2
//		list.add(new Manager(4, "D", 25, "Cashier"));  // 3
//		list.add(new FullTime(5, "E", 21, 9, 3, 0.3));
//		list.add(new FullTime(6, "F", 22, 8, 1, 0.1));
//		for(Employee e : list) {
//			if(e instanceof FullTime) {
//				if(((FullTime) e).expYear == 3) {
//					System.out.println(e);
//				}
//			}
//		}
//		FullTime ft = (FullTime)list.get(1);
//		System.out.println(ft.bonus);
		Employee e;
		e = new FullTime(1, "A", 29, 6, 10, 0.5);
		System.out.println(e.getSalaryAfterCalculating());
		
	}
	
}
