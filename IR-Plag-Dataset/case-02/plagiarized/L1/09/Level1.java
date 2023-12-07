
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
public class Level1 {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        //masukkin radius
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        
        double area = radius * radius * 3.14159;
        double volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume of the cylinder is " + volume);
    }
}
