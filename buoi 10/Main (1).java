package Buoi10;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Lớp trừu tượng là lớp tương tự một lớp bình thường
		 * Lớp trừu tượng không thể dùng để tạo giá trị
		 * Những lớp ké thừa từ lớp trừu tượng sẽ phải ghi đè tất cả phương thức trừu tượng (phương thức không có phần thân non-body method) của lớp trừu tượng đó
		 */
//		Employee e1 = new PartTime(1, "T", 29, 10);
//		System.out.println(e1.getSalaryAfterCalculating());
//		Employee e2 = new FullTime(1, "S", 32, 11, 10, 0.45);
//		System.out.println(e2.getSalaryAfterCalculating());
		
		/*
		 * Interface không thể dùng để tạo giá trị
		 * Những lớp triển khai từ interface sẽ phải ghi đè tất cả phương thức trừu tượng (phương thức không có phần thân non-body method) của interface đó
		 * Trong interface có 3 thành phần chính: Hằng số lớp, Phương thức lớp, Phương thức trừu tượng
		 */
//		ManagementSystemSkeletion ms = new ManagementSystem();
//		ms.create(new PartTime(1, "Thành", 28, 4));
//		ms.create(new FullTime(2, "Thuyết", 29, 10, 6, 0.13));
//		ms.create(new PartTime(3, "Đạt", 27, 9));
//		ms.showAll();
		
//		System.out.println(ManagementSystemSkeletion.PI);
//		ManagementSystemSkeletion.greeting();
		
	}

}
