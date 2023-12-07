import java.util.Scanner;
public class T03
{
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
      System.out.print("Enter weight in pounds: ");
      int w= sc.nextInt();
      System.out.print("Enter feet: ");
      int f= sc.nextInt();
      System.out.print("Enter inches: ");
      int i= sc.nextInt();
      double bmi = ((w*0.45359237)/(((f*12+ i)*0.0254)*((f*12+i)*0.0254)));
      System.out.println("BMI is "+bmi);
      if(bmi < 18.5)
      {
         System.out.println("Underweight");
      }
      else if(bmi >= 18.5 && bmi < 25)
      {
         System.out.println("Normal");
      }
      else if(bmi >= 25 && bmi < 35)
      {
         System.out.println("Overweight");
      }
      else if(bmi >= 35)
      {
         System.out.println("Obese");
      }


   }
}