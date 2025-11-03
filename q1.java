import java.util.Random;
//This code uses binary search to find a number between 1 and one million.
// It tries 500 numbers and gives the number of calls for each trial then averages them
public class q1 {
	
	public static int binary_search(int min, int max, int target, int guess) {
		
		if(min > max) {
			return -1;
		}
		int mid = (max + min) / 2;
		guess++;
		if(target < mid) {
			System.out.println("The number is lower than " + mid);
			return binary_search(min, mid-1, target, guess);
		}
		else if(target > mid) {
			System.out.println("The number is higher than " + mid);
			return binary_search(mid+1,max,target, guess);
		}
		else {
			System.out.println("The number is found. It is " + mid);;
			return guess;
		}
		}

	public static void main(String[] args) {
		Random random = new Random();
		int max = 1000000;
		int min = 1;
		int trials = 500;
		int total_guess = 0;
		for (int i = 1; i <= trials; i++ ) {
			int guess = 0;
			System.out.println("Guess-" + i + ":");
			int r1 = random.nextInt(max - min + 1) + min;
			guess = binary_search(min, max, r1, guess);
			System.out.println("The number of guessing trial is "+ guess + "\n");
			total_guess += guess;
		}
		double avg_guess = (double) total_guess /trials;
		System.out.println("The average number of guessing trial is "+ avg_guess + "\n");
		

		
		
		
		
	}

		
		
	

}
