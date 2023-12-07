
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author E3AFED0047B08059D0FADA10F400C1E5
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Masukan radius silinder
        System.out.print("Enter the radius and length of a cylinder: ");
        double jejari = input.nextDouble();
        double length = input.nextDouble();
        double area = jejari * jejari * 3.14159;
        double volume = area * length;
        // Mencetak luas dan volume
        System.out.println("The area is " + area);
        System.out.println("The volume of the cylinder is " + volume);
        }
}
