
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
        
        double jejari, panjang;
        jejari = input.nextDouble();
        panjang = input.nextDouble();
        
        // Mencetak luas dan volume
        System.out.println("The area is " + hitungArea(jejari));
        System.out.println("The volume of the cylinder is " + hitungVolume(panjang, jejari));
        }
    
    public static double hitungArea(double jejari){
        double area;
        return area = Math.pow(jejari, 2) * 3.14159;
    }
    
    public static double hitungVolume(double panjang, double jejari){
        double volume;
        return volume = hitungArea(jejari) * panjang;
    }
}
