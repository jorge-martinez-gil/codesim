

/**
 *
 * @author B00A50C448238A71ED479F81FA4D9066
 */

import java.util.Scanner;

public class T03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, feet, inches, height, bmi;
        
        System.out.print("Enter weight in pounds: ");
        weight = sc.nextDouble();
        
        System.out.print("Enter feet: ");
        feet = sc.nextDouble();
        
        System.out.print("Enter inches: ");
        inches = sc.nextDouble();
        
        height = feet * 12 + inches;
        bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254));
        
        System.out.println("BMI is " + bmi);
        if(bmi < 18.5) {
            System.out.println("Underweight");
        }else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal");
        }else if(bmi >= 25 && bmi < 35) {
            System.out.println("Overweight");
        }else if(bmi >= 35) {
            System.out.println("Obese");
        }
    }
}
