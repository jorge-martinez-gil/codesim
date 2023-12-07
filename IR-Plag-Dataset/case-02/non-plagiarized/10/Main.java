
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius=sc.nextDouble();
        int length=sc.nextInt();

        double area=radius*radius*3.14159;
        System.out.println("The area is "+area);
        System.out.println("The volume is "+area*length);
    }
}
