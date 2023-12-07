
import java.util.*;

public class L2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double berat = sc.nextDouble();

        System.out.print("Enter feet: ");
        double feet = sc.nextDouble();
        System.out.print("Enter inches: ");
        double inci = sc.nextDouble();
        double tinggi = feet * 12 + inci;

        double bmi = berat * 0.45359237
                / ((tinggi * 0.0254) * (tinggi * 0.0254));

        System.out.println("BMI is " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }

}
