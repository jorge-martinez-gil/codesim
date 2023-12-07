
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 6ED61D4B80BB0F81937B32418E98ADCA A94652AA97C7211BA8954DD15A3CF838
 */
public class T02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder:");
        double radius = sc.nextDouble();
        double length = sc.nextDouble();
        double area = Math.pow(radius, 2) * Math.PI;
        double volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
        
        
    }
}
