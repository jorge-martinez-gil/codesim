
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CB6AB3315634A1E4D11B091BA48B60BA 7E51EEA5FA101ED4DADE9AD3A7A072BB 2F809B10D1ABEDBF2EC288F851B3EBBB
 */
public class T02 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = sc.nextDouble();
        double length = sc.nextDouble();
        
        double area = radius * radius * 3.14159;
        double volume = area * length;
        
        System.out.println("The area is " + (float)area);
        System.out.printf("The volume is %.1f", volume);
        System.out.println();
        
    }
}
