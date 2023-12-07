import java.util.*;

class inputoutput{
	static double kaki,bobot,bmi,inc,height;
	static double hitHeight(double kaki, double inc)
	{
		return kaki * 12 + inc;
	}
	static double hitBmi(double bobot, double height)
	{
		return bobot * 0.45359237 /
		((height * 0.0254) * (height * 0.0254));
	}
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		
		 bobot = input.nextDouble();
		System.out.print("Enter feet: ");
		 kaki = input.nextDouble();
		
		System.out.print("Enter inches: ");
		 inc = input.nextDouble();
		 height = hitHeight(kaki,inc);
		 bmi = hitBmi(bobot,height);
		
		
		// hasil
		System.out.print("BMI is " + bmi+"\n");
		if (bmi < 18.5)
		System.out.print("Underweight"+"\n");
		else if (bmi < 25)
		System.out.println("Normal");
		else if (bmi < 30)
		System.out.println("Overweight");
		else
		System.out.println("Obese");
	}
}