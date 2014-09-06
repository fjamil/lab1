package mainpackage;

import java.util.Scanner;
public class lab1 {

	
//This is the lab #1 repo.
	
	public static void main(String [ ] args){
		
		Scanner userInputScanner = new Scanner(System.in);
		
		System.out.print("How many years will you work?");
		double workyears = userInputScanner.nextDouble();
		
		System.out.print("What is the annual return?");
		double ratew = userInputScanner.nextDouble();
		
		System.out.print("What is your required income?");
		double reqincome = userInputScanner.nextDouble();
		
		System.out.print("What is the planned SSI return?");
		double ssi = userInputScanner.nextDouble();
		
		//double workyears = 40.0;
		//double ratew = .07;
		//double reqincome = 10000.0;
		double x = 1454485.55; // We have this to compare actual to our result
		//double ssi = 2642.0;
		
		double income = reqincome - ssi; // Present Value
		
		double FV = ((income * 12) * Math.pow(Math.E,(ratew * workyears))); 
		
		double P1 = ((x * (ratew/12))/((Math.pow((1 + (ratew/12)),(workyears*12))-1))); // Comparing this values
		
		double P = ((FV * (ratew/12))/((Math.pow((1 + (ratew/12)),(workyears*12))-1)));// To this value that we get from our calculations
		
		System.out.println(FV); // Future Value
		System.out.println(P); // Payment
		System.out.println(P1);
	}
	
	
}
