
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
public class Level5 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double radius, tinggi;
        
        //masukkan nilai
        System.out.print("Enter the radius and length of a cylinder: ");
        radius = input.nextDouble();
        tinggi = input.nextDouble();

        hitung(radius, tinggi);
    }

    private static void hitung(double radius, double tinggi) 
    {
        double area = radius * radius * 3.14159;
        double volume = radius * radius * 3.14159 * tinggi;
        System.out.println("The area is " + area);
        System.out.println("The volume of the cylinder is " + volume);
    }
}
