// Reverse the numbers
//
import java.util.Scanner;

public class expt5 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// Prompt the user to enter the integer
		System.out.print("Reverse integer\nEnter your integer:");
		int num = sc.nextInt();
		int temp = num;
		int res = 0;
		// To reverse the integer:
		while(temp>0){
			res = res*10 + temp%10;
			temp=temp/10;
		}
		System.out.println(Integer.toString(res));

	}
}
