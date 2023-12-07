import java.util.*;

class inputoutput{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		
		double bobot = input.nextDouble();
		System.out.print("Enter feet: ");
		double kaki = input.nextDouble();
		
		System.out.print("Enter inches: ");
		double inc = input.nextDouble();
		double height = kaki * 12 + inc;
		double bmi = bobot * 0.45359237 /
		((height * 0.0254) * (height * 0.0254));
		
		
		// hasil
		System.out.println("BMI is " + bmi);
		if (bmi < 18.5)
		System.out.println("Underweight");
		else if (bmi < 25)
		System.out.println("Normal");
		else if (bmi < 30)
		System.out.println("Overweight");
		else
		System.out.println("Obese");
	}
}