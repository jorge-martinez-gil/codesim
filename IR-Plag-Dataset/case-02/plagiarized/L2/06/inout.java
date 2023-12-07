
import java.util.Scanner;


public class inout{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Enter radius of the cylinder
        System.out.print("Enter the radius and length of a cylinder : ");//untuk print
        double rad = sc.nextDouble();//menginput radius
        double l = sc.nextDouble();//menginput length
        double ar = rad*rad*3.14159;//mencari area
        double vol = ar*l;//mencari voulume
        System.out.println("The area is " + ar);//mengeluarkan hasil
        System.out.println("The volume of the cylinder is " + vol);//mengeluarkan hasil
    }

}
