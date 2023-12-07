

import java.util.Scanner;

/**
 *
 * @author 020A6EC1A4D0C5BDB29FF826A462DA1C5D88CF08B60A4744AFFD95C61A0C3C7E
 */
public class Main {
    private static double weights,feets,inches,heights,bmi;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Prompt the user to enter weight in pounds 
        System.out.print("Enter weight in pounds: ");
        weights = input.nextDouble();
        
        //Prompt the user to enter height
        System.out.print("Enter feet: ");
        feets = input.nextDouble();
        System.out.print("Enter inches: ");
        inches = input.nextDouble();
        
        //Compute BMI
        heights = feets * 12 + inches;
        bmi = weights * 0.45359237
        / ((heights * 0.0254) * (heights * 0.0254));
        cetak();
    }
    public static void cetak(){
        //Display result
        System.out.println("BMI is " + bmi); 
        if (bmi >= 30){
            System.out.println("Obese");
        } else if (bmi >= 25) {
            System.out.println("Overweight");
        }else if (bmi >= 18.5) {
            System.out.println("Normal");
        } else {
            System.out.println("Underweight");
        }
    }
}
