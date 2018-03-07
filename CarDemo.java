package chapter6;
import java.io.*;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class CarDemo {
	public static  void main(String[] args) throws IOException
	{
		String input;
		
            	
		input =  JOptionPane.showInputDialog("Enter the model car you want, R142 or R160. If you want R142 you have a number line in the A division and your car will be 8 feet wide."
				+ " If you choose model R160 you will have a letter line in the B division and the car will be 10 feet wide.  ");
		SubwayCar car2 = new SubwayCar();
		car2.setModel(input);
	if (car2.getDivision() =='A'){	input =  JOptionPane.showInputDialog("Enter the line number: ");
 char c =	input.charAt(0);
 car2.setLine(c);}
	else {input =  JOptionPane.showInputDialog("Enter the line letter: ");char d =	input.charAt(0);
	car2.setLine(d);
	}	
	JOptionPane.showMessageDialog( null," Your model is " + car2.getModel() +
	", your division is " + car2.getDivision() + ", and your line is " + car2.getLine());
	
	 String car2info = String.format("%5s%5c%5c",car2.getModel(),car2.getDivision(),car2.getLine()); 
	
	 File file = new File("mysubwayCar.txt");
	 Scanner readFile = new Scanner(file);
	 SubwayCar car1 = new SubwayCar();
    car1	= SubwayCar.readSubwayCar(readFile);
	 FileWriter fwriter = new FileWriter("mysubwayCar.txt", true);
	PrintWriter outputFile = new PrintWriter(fwriter);
	car2.writeSubwayCar(outputFile);
	     System.out.print(car1);
	     System.out.println(car2info);
		outputFile.close();
		System.exit(0);
		
	}
}
