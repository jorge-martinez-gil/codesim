
import java.util.Scanner;


public class inputoutput{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter radius of the cylinder
        System.out.print("Enter the radius and length of a cylinder : ");//untuk print
        double radius = input.nextDouble();//menginput radius
        double length = input.nextDouble();//menginput length
        double area = radius*radius*3.14159;//mencari area
        double volume = area*length;//mencari voulume
        System.out.println("The area is " + area);//mengeluarkan hasil
        System.out.println("The volume of the cylinder is " + volume);//mengeluarkan hasil
    }

}
