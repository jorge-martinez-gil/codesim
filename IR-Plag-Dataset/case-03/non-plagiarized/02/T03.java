
import java.util.Scanner;


/**
 *
 * @author 65FBEF05E01FAC390CB3FA073FB3E8CF (452BF208BF901322968557227B8F6EFE010)
 */
public class T03 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        float w=s.nextFloat();
        System.out.print("Enter feet: ");
        float f=s.nextFloat();
        System.out.print("Enter inches: ");
        float i=s.nextFloat();
        float h=f*12+i;
        float bmi = (float) ((w*0.45359237)/((h*0.0254)*(h*0.0254)));
        System.out.println("BMI is "+bmi);
        if(bmi<18.5){
            System.out.println("Underweight");
        } else if (bmi>=18.5 && bmi<25){
            System.out.println("Normal");
        } else if (bmi>=25 && bmi<35){
            System.out.println("Overweight");
        } else if (bmi>=35) {
            System.out.println("Obese");
        }
    }
}
