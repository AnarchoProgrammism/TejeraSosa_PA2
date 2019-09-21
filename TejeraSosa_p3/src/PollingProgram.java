import java.util.Scanner;
public class PollingProgram {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] topics = new String [5];
		int[][] responses = new int[5][10];
		double[] avg = new double [5];
		int[] sum = new int [5];
		int[] count = new int [5];
		int inputRating;
		char exit = 'y';
		int highestPointTotal;
		int lowestPointTotal;
		String highestPointIssue;
		String lowestPointIssue;
		
		topics[0] = "Medicare for all";
		topics[1] = "Climate Change/Saving the planet";
		topics[2] = "Ending Capitalism";
		topics[3] = "Electing Bernie Sanders";
		topics[4] = "Making College Free";
		
		System.out.println("Welcome to our survey!");
		System.out.println();
		System.out.println("Please rate the following topics on a scale of 1(least important) to 10(most important).");
		System.out.println();
		
		for (int i = 0; i < 5; ++i) {
			System.out.println(topics[i]);
		}
		
		System.out.println();
		while (exit == 'y') {
			for (int i  = 0; i < 5; ++i) {
				System.out.println("How important is " + topics[i] + " to you?");
				inputRating =  in.nextInt();
				while (inputRating < 1 || inputRating > 10) {
					System.out.println("Not a valid rating.");
					System.out.println("Please enter a rating from 1 to 10");
					inputRating =  in.nextInt();
				}
				++responses[i][inputRating - 1];
				sum[i] = sum[i] + inputRating;
				++count[i];
				avg[i] = (double)sum[i] / count[i];
			}
			
			System.out.print("Do you want to add another user's data? ");
			System.out.println("Press y for yes, any other letter for no");
			exit = in.next().charAt(0);
		}
		
		System.out.print("                                 ");
		for (int i = 1; i <= 10; ++i) {
			System.out.print(i + " ");
		}
		
		System.out.println("| Avg");
		
		System.out.print(topics[0] + "                 ");
		for (int i = 0; i < 10; ++i) {
			System.out.print(responses[0][i] + " ");
		}
		System.out.println(" | " + avg[0]);
		
		System.out.print(topics[1] + " ");
		for (int i = 0; i < 10; ++i) {
			System.out.print(responses[1][i] + " ");
		}
		System.out.println(" | " + avg[1]);

		System.out.print(topics[2] + "                ");
		for (int i = 0; i < 10; ++i) {
			System.out.print(responses[2][i] + " ");
		}
		System.out.println(" | " + avg[2]);

		System.out.print(topics[3] + "          ");
		for (int i = 0; i < 10; ++i) {
			System.out.print(responses[3][i] + " ");
		}
		System.out.println(" | " + avg[3]);

		System.out.print(topics[4] + "              ");
		for (int i = 0; i < 10; ++i) {
			System.out.print(responses[4][i] + " ");
		}
		System.out.println(" | " + avg[4]);
		
		System.out.println();
		
		highestPointTotal = sum[0];
		highestPointIssue = topics[0];
		for (int i = 1; i < 5; ++i) {
			if (sum[i] > highestPointTotal) {
				highestPointTotal = sum[i];
				highestPointIssue = topics[i];
			}
		}
		System.out.println("The topic with the most points is " + highestPointIssue);
		
		lowestPointTotal = sum[0];
		lowestPointIssue = topics[0];
		for (int i = 1; i < 5; ++i) {
			if (sum[i] < lowestPointTotal) {
				lowestPointTotal = sum[i];
				lowestPointIssue = topics[i];
			}
		}
		System.out.println("The topic with the least points is " + lowestPointIssue);

	}

}
