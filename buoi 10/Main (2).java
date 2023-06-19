package Buoi10.demo;
import javax.swing.JFrame;
import javax.swing.JButton;


public class Main {
	
	public static void main(String[] args) {
		
		JFrame frame =new JFrame();  //creating instance of JFrame
		
		JButton button = new JButton("Please, click me!");  //creating instance of JButton  
		button.setBounds(130, 100, 100, 40);  //x axis, y axis, width, height  
		MyCustomFunctionForButton function = new MyCustomFunctionForButton();
		button.addActionListener(function);
		frame.add(button);
		
		frame.setSize(400, 500);  //400 width and 500 height  
		frame.setLayout(null);  //using no layout managers  
		frame.setVisible(true);  //making the frame visible  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
