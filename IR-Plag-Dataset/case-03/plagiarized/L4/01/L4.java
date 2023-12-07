
import java.util.*;

public class L4 {
    public static double hitBmi(double berat, double tinggi)
    {
        return berat * 0.45359237 / ((tinggi * 0.0254) * (tinggi * 0.0254));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double berat = 0;
        double inci = 0;
        double tinggi = 0 ;
       
        double feet = 0;
        
        System.out.print("Enter weight in pounds: ");
        berat = sc.nextDouble();

        System.out.print("Enter feet: ");
        feet = sc.nextDouble();
        System.out.print("Enter inches: ");
        inci = sc.nextDouble();
         tinggi = feet * 12 + inci;

        System.out.println("BMI is " + hitBmi(berat,tinggi));
        if (hitBmi(berat,tinggi) < 18.5) {
            System.out.println("Underweight");
        } else if (hitBmi(berat,tinggi) < 25) {
            System.out.println("Normal");
        } else if (hitBmi(berat,tinggi) < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }

}
