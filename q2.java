import java.util.Scanner;
public class q2 {
//This program converts a decimal number to base-r based on user inputs
	public static void to_base_r(int r,int n) {
		if(n == 0) {
			return;
		}
		
		to_base_r(r, n/r);
		if(r == 16 && n % r >= 10){
			System.out.print((char) ('A' + (n%r-10))+ " ");
		}
		else {
			System.out.print(n % r + " ");
		
		}
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter r value: ");
		int r = s.nextInt();
		System.out.println("Enter a postivie decimal value: ");
		int n = s.nextInt();
		if( n == 0) {
			System.out.println("The decimal number " + n + " is " + n + " in base -"+ r + " number system");
		}
		else {
			System.out.print("The decimal number " + n + " is ");
			to_base_r(r,n);
			System.out.print("in base -"+ r + " number system");
			
		}
		
		s.close();
	}
}