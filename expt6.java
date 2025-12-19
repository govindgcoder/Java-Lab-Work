// Sum of first N natural numbers

import java.util.Scanner;

public class expt6 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Sum of n Natural Numbers\nEnter n:");
		int n = sc.nextInt();
		int sum = 0;
		// Loop to find the sum
		for(int i = 1; i<=n; i++){
			sum=sum+i;
		}
		System.out.println("The sum of "+Integer.toString(n) + " Natural numbers is: "+ Integer.toString(sum));
	}
}
