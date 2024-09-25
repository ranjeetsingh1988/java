package xyz;
import java.util.Scanner;
public class arrayTesting {

	public static void main(String[] args) {
		float[] test= {100,90,75,75,50};
		float sum=0;
		for(float elements:test) {
			sum=sum+elements;
		}
		System.out.println("The Value Of The Sum Is:" + sum);

	}

}
  