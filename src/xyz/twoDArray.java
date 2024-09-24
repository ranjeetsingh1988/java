package xyz;
import java.util.Scanner;
public class twoDArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int [][] flats= new int [2][2];
		
		for(int i=0; i<flats.length; i++) {
			//System.out.println(flats.length);
			for(int j=0; j<flats[i].length; j++) {
				//System.out.println(flats[j].length);
				flats[i][j]=sc.nextInt();
			}
		}
		System.out.println("Printing 2-D Using For Loop");
		for(int i=0;i<flats.length;i++) {
			for(int j=0; j<flats[i].length;j++) {
				System.out.print(flats[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
			}
	}
}


