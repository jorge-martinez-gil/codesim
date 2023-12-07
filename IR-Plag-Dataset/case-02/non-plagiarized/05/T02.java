import java.util.Scanner;
public class T02
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the radius and length of a cylinder: ");
      String radlen= sc.nextLine();
      String[] splited = radlen.split("\\s+");
      float rad = Float.parseFloat(splited[0]);
      float len = Float.parseFloat(splited[1]);
      System.out.println("The area is "+Math.round(rad*rad*3.14159*10000.0)/10000.0);
      System.out.println("The volume is "+Math.round(rad*rad*3.14159*len*10.0)/10.0);

   }
}