
import java.util.Scanner;

/**
 *
 * @author 92E0988C1682C76D4D307AA15EC8346E
 */
public class T03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds : ");
        double weight = sc.nextDouble();
        System.out.print("Enter feet : ");
        double feet = sc.nextDouble();
        System.out.print("Enter inches : ");
        double inches = sc.nextDouble();
        double height = feet * 12 + inches;
        double bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254)) ;
        System.out.println("The area is " + bmi);
        if (bmi < 18.5){
            System.out.println("Underweight");
        }else if (bmi < 25){
            System.out.println("Normal");
        }else if (bmi < 35){
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
    }
}
