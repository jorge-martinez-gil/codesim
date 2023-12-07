
import java.util.*;

public class L6 {

    public static double hitBmi(double berat, double tinggi) {
        return berat * 0.45359237 / ((tinggi * 0.0254) * (tinggi * 0.0254));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double berat, inci, tinggi, feet = 0;

        System.out.print("Enter weight in pounds: ");
        berat = sc.nextDouble();

        System.out.print("Enter feet: ");
        feet = sc.nextDouble();
        System.out.print("Enter inches: ");
        inci = sc.nextDouble();
        tinggi = feet * 12 + inci;

        System.out.println("BMI is " + hitBmi(berat, tinggi));
        if (hitBmi(berat, tinggi) < 25 && hitBmi(berat, tinggi) > 18.5) {
            System.out.println("Normal");
        } else if (hitBmi(berat, tinggi) < 30 && hitBmi(berat, tinggi) > 25) {
            System.out.println("Overweight");
        } else if (hitBmi(berat, tinggi) > 30) {
            System.out.println("Obese");
        } else {
            System.out.println("Underweight");
        }
    }

}
