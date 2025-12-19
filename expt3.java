public class expt3 {
	public static void print(String s){System.out.print(s);}
	public static void main(String[] args){
		for(int i = 0; i<3; i++){
			for(int j = 0; j<=i; j++){
				print("*");
			}
			print("\n");
		}
	}
}
