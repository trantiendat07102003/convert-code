package Buoi13;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;
import java.io.FileWriter;
import java.io.BufferedWriter;


public class Main {

	public static void main(String[] args) {
		
		// D:\Java\JavaCore\Java_J12\src\Buoi13\my_data.txt
		
		/*
		 * Ghi dữ liệu vào file
		 */
//		File file = new File("D:\\Java\\JavaCore\\Java_J12\\src\\Buoi13\\my_data.txt");
//		try {
////			FileWriter fileWriter = new FileWriter(file, true);
//			FileWriter fileWriter = new FileWriter(file);
//			BufferedWriter bw = new BufferedWriter(fileWriter);
//			
//			int numOflines = 5;
//			Random random = new Random();
//			for(int i = 0; i < numOflines; i++) {
//				int numOfNumbers = random.nextInt(10) + 1;
//				for(int j = 0; j < numOfNumbers; j++) {
//					bw.write(random.nextInt(100) + 1 + "");
//					if(j != numOfNumbers - 1) {
//						bw.write(" ");
//					}
//				}
//				bw.write("\n");
//			}
//			
//			bw.close();
//			System.out.println("Ghi file thành công!");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		/*
		 * Đọc dữ liệu từ file
		 */
		File file = new File("D:\\Java\\JavaCore\\Java_J12\\src\\Buoi13\\my_data.txt");
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);
			
			String line;
			while(true) {
				line = br.readLine();
				if(line != null) {
//					System.out.println(line);
					String[] strArray = line.split(" ");
					int sum = 0;
					for(String s : strArray) {
						sum += Integer.parseInt(s);
					}
					System.out.println("Result: " + sum);
				}else {
					break;
				}
			}
			
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
