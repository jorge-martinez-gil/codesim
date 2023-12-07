import java.util.Scanner;

public class cabang {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double w,f,i,h,TotalBmi;
        System.out.print("Enter weight in pounds : ");
        w = input.nextDouble();//inputan weight
        System.out.print("Enter feet : ");
        f = input.nextDouble();//inputan feet
        System.out.print("Enter inches : ");
        i = input.nextDouble();//inputan inches
        h = f * 12 + i;// menghitung tinggi       
        TotalBmi = w * 0.45359237 / ((h * 0.0254) * (h * 0.0254)); //menghitung BMI
        //menampilkan hasil
        System.out.println("BMI is " + TotalBmi);
        if (TotalBmi < 18.5) {
            System.out.println("Underweight ");
        } else if (TotalBmi < 25) {
            System.out.println("Normal ");
        } else if (TotalBmi < 30) {
            System.out.println("Overweight ");
        } else {
            System.out.println("Obese ");
        }
    }
}
