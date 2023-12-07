import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weightUser = sc.nextDouble();
        // Prompt the user to enter height
        //enter feet
        System.out.print("Enter feet: ");
        double feetUser = sc.nextDouble();
        //enter inches
        System.out.print("Enter inches: ");
        double inchesUser = sc.nextDouble();

        //process
        double heightUser = feetUser * 12 + inchesUser;
        // Compute BMI
        double bmi = weightUser * 0.45359237 / ((heightUser * 0.0254) * (heightUser * 0.0254));
        // Display result
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
