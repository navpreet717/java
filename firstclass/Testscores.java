package firstclass;

import java.util.Scanner;

public class Testscores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
		
		System.out.println("enter testr score 1");
double score1=keyboard.nextDouble();
		
		System.out.println("enter testr score 2");
		double score2=keyboard.nextDouble();
		System.out.println("enter test score 3");
		double score3=keyboard.nextDouble();
		//average
		double average1=(score1+score2+score3)/3;
		System.out.println("average is"+""+average1);
	}

}
