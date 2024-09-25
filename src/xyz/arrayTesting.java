package xyz;
import java.util.Scanner;
public class arrayTesting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float sum=sc.nextFloat();
		float[] test= {100,90,75,75,50};
		boolean isInArray = false;
		for(float elements:test) {
			if(sum==elements) {
				isInArray = true;
				break;
			}
		}
		if(isInArray) {
		System.out.println("The Value is Present in Array");
		}else
			System.out.println("The Value is Not Present in Array");
	}

}
  