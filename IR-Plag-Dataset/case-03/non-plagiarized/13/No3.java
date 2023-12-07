

import java.util.Scanner;

/**
 *
 * @author 9BC88124A9BB1C629D5FFBCD81612170
 */
public class No3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner sc = new Scanner(System.in);
        double height,weight,feet,inches,bmi;
        System.out.print("Enter weight in pounds: ");
        weight = sc.nextDouble();
        System.out.print("Enter feet: ");
        feet = sc.nextDouble();
        System.out.print("Enter inches: ");
        inches = sc.nextDouble();
        height = feet * 12 + inches;
        bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254));
        System.out.println("BMI is " + bmi);
        if(bmi<18.5)
            System.out.println("Underweight");
        else if(bmi<25)
            System.out.println("Normal");
        else if(bmi<35)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
    
}
