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
public class Level3 
{

    public static void main(String[] args) 
    {
        Scanner x = new Scanner(System.in);
        double vol = 0;
        double luasAlas = 0;
        
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = x.nextDouble();
        double length = x.nextDouble();
        
        luasAlas = radius * radius * 3.14159;
        vol = luasAlas * length;
        
        System.out.println("The area is " + luasAlas);
        System.out.println("The volume of the cylinder is " + vol);
    }
}
