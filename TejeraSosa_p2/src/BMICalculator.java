import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double weight;
		double height;
		double bMI;
		int formula;
		
		System.out.println("Which formula would you like to use:");
		System.out.println("Press 1 for pounds and inches");
		System.out.println("Press 2 for kilograms and meters");
		formula = in.nextInt();
		
		switch (formula) {
		case 1:
			System.out.println("Please enter weight in pounds:");
			weight = in.nextDouble();
			
			System.out.println("Please enter height in inches:");
			height = in.nextDouble();
			
			bMI = (703.0 * weight) / Math.pow(height, 2);
			System.out.println("You have a " + bMI + " BMI");
			break;
			
		case 2:
			System.out.println("Please enter weight in kilograms:");
			weight = in.nextDouble();
			
			System.out.println("Please enter height in meters:");
			height = in.nextDouble();
			
			bMI = weight / Math.pow(height, 2);
			System.out.println("You have a " + bMI + " BMI");
			break;
		
		default:
			System.out.println("That was not a choice: ");
			break;
		}
		
		System.out.println();
		if (formula == 1 || formula == 2 ) {
			System.out.println("BMI Categories:");
			System.out.println("Underweight = <18.5");
			System.out.println("Normal weight = 18.5–24.9");
			System.out.println("Overweight = 25–29.9");
			System.out.println("Obesity = BMI of 30 or greater");
		}
		
		// TODO Auto-generated method stub

	}

}
