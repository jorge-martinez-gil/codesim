

import java.util.Scanner;
/**
 *
 * @author CB6AB3315634A1E4D11B091BA48B60BA
 */
public class Nomor3_2451041557A22145B3701B0184109CAB013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        int weight = sc.nextInt();
        System.out.print("Enter feet: ");
        int feet = sc.nextInt();
        System.out.print("Enter inch: ");
        int inches = sc.nextInt();
        int height = feet*12 + inches;
        double bmi = weight*0.45359237/((height*0.0254)*(height*0.0254));
        System.out.println("BMI is " + bmi);
        if(bmi<18.5){
            System.out.println("underweight");
        }
        else if(bmi>=18.5 && bmi<25){
            System.out.println("Normal");
        }
        else if(bmi>=25 && bmi<35){
            System.out.println("overweight");
        }
        else if(bmi >35){
            System.out.println("obese");
        }
    }
    
}
