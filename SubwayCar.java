package chapter6;
import java.io.*;

import java.util.Scanner;
public class SubwayCar {
	
	    String model;
		char division;
		char line;
		double length;
		double width;
		String bad;
		String carNumber;
		String Car;
		String car;
	public SubwayCar(  ){	
		
		
	}
	
		public  boolean setModel(String mod)
		{
			if (mod.compareTo("R142") == 0){ model = mod;
			              setDivision('A');
				
	}
			else if (mod.compareTo("R160") == 0){
				model =  mod;
				setDivision('B');
			}
			else	return false;
			return true;
		}
	public void setLine(char l )
	{
	
	line = l;
	
		
	}

	public String getModel(){ return model;}
	public char getLine() { return line;}
	public void setDivision( char div  )  { division = div;     }
	public char getDivision () { return division;}
	public  String toString() 
	{ return "Model\t" + getModel() +      "\r\n"+"Division\t" + getDivision() +   "\r\nLine\t" + getLine() + "\r\n" + "." + " \r\n\r\n";  
    }
	public boolean  writeSubwayCar( PrintWriter pw) throws IOException
	{
				 pw.print(toString());
		 return true;
}
	public SubwayCar(
			String model,
		char division,
		char line,
		double width,
		String carNumber){
		
	}

	public static SubwayCar readSubwayCar(Scanner scnr  )
	{
		SubwayCar car1 = new SubwayCar();
               String field = scnr.next();		 
		while(scnr.hasNext() && field.compareTo(".") != 0 )
		{
			
		 
		 switch(field)
		 {
		 case "Model":
		String	mod = scnr.next();
		car1.setModel(mod);
		break;
		 case "Division":
		String division  = scnr.next();
		 char dvnm = division.charAt(0);
		   car1.setDivision(dvnm);
		break;
		 case "Line":
		String Line  = scnr.next();
		
	char lne =	 Line.charAt(0);
		
		car1.setLine(lne);
		break;
		
			 
		 }
		
		
		
		
		
		}
		return car1;
	}
	
		
	}

