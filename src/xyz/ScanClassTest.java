package xyz;
import java.util.Scanner;
public class ScanClassTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// Ask user for the size of the array
		System.out.println("Enter The Number Of Element In Array");
		int n = sc.nextInt();
		int[] arr=new int[n];
		// Ask user to input the elements of the array
		System.out.println("Enter The Element Of Array");
		//For Loop
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		boolean isSorted= true;
		
		for(int i=0;i<n-1;i++) {
			if(arr[i]>arr[i+1]) {
				isSorted=false;
				break;
			}
		}
		if(isSorted) {
			System.out.println("The Array Is Sorted");
		}else
			System.out.println("The Array Is Not Sorted");
	}
	
}
