import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] fourDigits = new int [4];
		int userInput;
		
		System.out.println("Enter a four digit integer:");
		userInput = in.nextInt();
		in.close();
		
		fourDigits[3] = userInput % 10;
		userInput = userInput / 10;
		fourDigits[2] = userInput % 10;
		userInput = userInput / 10;
		fourDigits[1] = userInput % 10;
		userInput = userInput / 10;
		fourDigits[0] = userInput % 10;
		
		//Encrypt
		for (int i = 0; i < 4; ++i) {
			fourDigits[i] = (fourDigits[i] + 7) % 10;
		}
		
		//swap
		for (int i = 0; i < 2; ++i) {
			int tmpNum;
			tmpNum = fourDigits[i];
			fourDigits[i] = fourDigits[i + 2];
			fourDigits[i + 2] = tmpNum;
		}
		
		//Print
		System.out.println("Encrypted:");
		for (int i= 0; i < 4; ++i) {
			System.out.print(fourDigits[i]);
		}
	}

}
