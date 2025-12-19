// To find the factorial

import java.util.Scanner;

public class exptFactorial {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Factorial calculator:\nEnter the value for n");
		int n = sc.nextInt();
		int res = 1;

		// Repeatedly multiplied with numbers uptill n
		for (int i = 1; i<=n; i++){
			res = res*i;
		}
		System.out.println("The factorial of "+Integer.toString(n)+" is "+Integer.toString(res));
	}
}
