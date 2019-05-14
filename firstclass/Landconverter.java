package firstclass;

import java.util.Scanner;

public class Landconverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//get the user input
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("how many sqr feet?");
		int squareFeet =keyboard.nextInt();
		//int squareFeet =keyboard.nextDouble();
		//double acres=(double)squareFeet/43560;//to get result in double
		// double acres =squareFeet/43560;
		//final double acres_to_feet=43560;
		//double acres=squareFeet/acres_to_feet;
		double acres = (double)(squareFeet/43560);
		//int acres = squareFeet/43560;
		System.out.println("number of acres"+""+acres);

		 

	}

}
