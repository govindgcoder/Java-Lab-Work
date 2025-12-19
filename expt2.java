import java.util.Scanner;

public class expt2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// User input for n
		System.out.println("Input the value for n: ");
		// Store the value for n
		int n = sc.nextInt();
		// print the horizontal string
		for(int i = 0; i<n; i++){
			System.out.print("* ");
		}
		// print the vertical stars
		System.out.println("");

		for(int i = 0; i<n; i++){
			System.out.println("* ");
		}
	}
}
