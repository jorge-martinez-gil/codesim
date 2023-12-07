
import java.util.Scanner;

public class Main {
    public static double countHeightUser(double feet,double inches){
        return feet*12+inches;
    }
    public static double countBmi (double height,double weight){
        return  weight * 0.45359237 /    (Math.pow((height * 0.0254),2));
    }
    public static void printBmi(double bmi){
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi > 18.5&& bmi < 25)
            System.out.println("Normal");
        else if (bmi > 25&& bmi < 30)
            System.out.println("Overweight");
        else if(bmi > 30)
            System.out.println("Obese");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declare
        double inchesUser,weightUser,feetUser,heightUser,bmi;

        //enter inches
        System.out.print("Enter inches: ");
        inchesUser = sc.nextDouble();

        // Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        weightUser = sc.nextDouble();
        // Prompt the user to enter height
        //enter feet
        System.out.print("Enter feet: ");
        feetUser = sc.nextDouble();

        //process
        heightUser = countHeightUser(feetUser,inchesUser);
        // Compute BMI
        bmi =countBmi(heightUser,weightUser);
        // Display result
        System.out.print("BMI is ");
        System.out.println(bmi);
        printBmi(bmi);
    }
}
