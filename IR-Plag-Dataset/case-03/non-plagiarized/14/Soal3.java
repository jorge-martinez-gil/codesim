

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 4900D0A19B6894A4A514E9FF3AFCC2C0
 */
public class Soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = sc.nextDouble();
        System.out.print("Enter feet: ");
        double feet = sc.nextDouble();
        System.out.print("Enter inches: ");
        double inches = sc.nextDouble();
        double height = feet * 12 + inches;
        double bmi = weight * 0.45359237 / ((height *0.0254)*(height *0.0254));
        System.out.println("BMI is "+bmi);
        if(bmi<18.5)
            System.out.println("Underweight");
        else if(bmi>=18.5 && bmi<25)
            System.out.println("Normal");
        else if(bmi>=25 && bmi<35)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
