// HCF calculator

// Import INPUT library
import java.util.Scanner;

public class expt4 {
	public static void print(String s){System.out.println(s);}
	public static void swap(int a, int b){
		int temp = a;
		a = b;
		b = a;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// Prompt user to input a and b
		// if a is larger than b:
		// consider a=25 and b=15
		// a % b = 10
		// b % (a%b) = 5
		// (a%b) % 5 = 0
		// so return 5

		print("HCF calculator for two numbers:");
		print("Enter the first number: ");

		int num1 = sc.nextInt();

		print("Enter the second number: ");

		int num2 = sc.nextInt();
		
		int temp;

		if(num1 < num2){
			temp = num2;
			num2 = num1;
			num1 = temp;
		}

		while(num1%num2!=0){
			temp=num2;
			num2 = num1%num2;
			num1 = temp;
		}
		print("The HCF of " + Integer.toString(num1) + " and " + Integer.toString(num2)+" is:");
		print(Integer.toString(num2));

	}	
}
