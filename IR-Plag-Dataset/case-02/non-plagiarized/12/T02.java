
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 6968A2C57C3A4FEE8FADC79A80355E4D F13FFB0C4AF5E1CE7C646A5222FBC1E9 2451041557A22145B3701B0184109CAB035
 */
public class T02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder : ");
        double radius = sc.nextDouble();
        double length = sc.nextDouble();

        double area = radius * radius * 3.14159;
        double volume = area * length;

        System.out.println("The area is " + area);
        System.out.println("The volume " + volume);

    }
}
