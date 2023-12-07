
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        int weight=sc.nextInt();
        System.out.print("Enter feet: ");
        int feet=sc.nextInt();
        System.out.print("Enter inches: ");
        int inches=sc.nextInt();
        double height=feet*12+inches;
        double bmi=weight*0.45359237 / ((height * 0.0254) * (height * 0.0254));
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
