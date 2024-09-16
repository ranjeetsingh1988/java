package xyz;

import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
	int num;
	System.out.println("Please enter student marks");
	Scanner sc = new Scanner(System.in);
	num = sc.nextInt();
	
	if(num >= 90) {
		System.out.println("You got A+ Marks");
	}else if(num >= 75) {
		System.out.println("You Got A Marks");
	}else if(num >= 50 ) {
		System.out.println("You Got B Marks");
	}else
		System.out.println("You Got C Marks");
	

	}

}