import java.util.Scanner;
public class q3 {
//This program prints the magic square of a nxn matrix that is odd
	public static int[][] build_magic_square(int n) {
		int[][] magic_square = new int[n][n];
		int row = 0, col = n/2, nsq = n * n;
		for(int i = 1; i <= nsq; i++) {
			magic_square[row][col] = i;
			if(i % n == 0) {
				row++;
			}
			else {
				if(col == n - 1) {
					col = 0;
				}
				else {
					col++;
				}
				if(row == 0) {
					row = n - 1;
				}
				else {
					row--;
				}
			}
		}
		return magic_square;
	}
	
	public static void print_magic_square(int[][] magic_square, int n){
		System.out.println("Your " + n + " by " + n + " magic square is: \n");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(magic_square[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	
	}
	
	public static void get_sums(int[][] magic_square, int n) {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += magic_square[i][i];
		}
		System.out.println("The sum of diagonol 1 is: " + sum);
		sum = 0;
		for(int i = 0; i < n; i++) {
			sum += magic_square[i][n-i-1];
		}
		System.out.println("The sum of diagonol 2 is: " + sum);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char again = 'Y';
		while(again == 'Y'){
			System.out.println("Enter a positive odd integer");
			int n = s.nextInt();
			while(n % 2 == 0) {
				System.out.println("Invalid number!");
				System.out.println("Enter a positive odd integer");
				n = s.nextInt();
			}
			int[][] magic_square = build_magic_square(n);
			print_magic_square(magic_square,n);
			get_sums(magic_square,n);
			System.out.println("Do you want to do it again(Y/N)?");
			again = s.next().charAt(0);
			again = Character.toUpperCase(again);
			
		}
	}

}
