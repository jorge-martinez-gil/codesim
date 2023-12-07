
import java.util.Scanner;
/**
 *
 * @author FD820A2B4461BDDD116C1518BC4B0F77 871C87F67A53ECC7201FF41AF0A05032
 */
public class T03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, feet, inches, bmi, height;
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
