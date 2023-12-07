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
        TotalBmi = HitBMI(w, h);//menghitung BMI
        //menampilkan hasil
        System.out.println("BMI is " + TotalBmi);
        Result(TotalBmi);
    }
    
    public static double HitBMI(double w,double h)
    {
        return  (w * 0.45359237) / ((h * 0.0254) * (h * 0.0254)); 
    }
    
    public static void Result(double TotalBmi)
    {
         if (TotalBmi > 30) {
            System.out.println("Obese ");
        } else if (TotalBmi < 25 && TotalBmi>18.5) {
            System.out.println("Normal ");
        } else if (TotalBmi>25 && TotalBmi < 30) {
            System.out.println("Overweight ");
        } else {
            System.out.println("Underweight ");
        }
    }
}