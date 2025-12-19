// Fibonacci calculator

import java.util.Scanner;

public class exptFibonacci {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Fibonacci sequence upto n elements\nEnter value for n:");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int temp;
		System.out.print("0, ");
		// Loop to repeatedly add a and b uptill we get to n
		for(int i=0; i<n-1; i++){
			temp = a;
			a = b;
			b = a + temp;
			System.out.print(Integer.toString(a) + ", ");
		}
	}
}
