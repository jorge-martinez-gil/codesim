
import java.util.Scanner;


public class inout{

    public static void main(String[] args) {
        double rad,l,ar,vol;
        Scanner sc = new Scanner(System.in);
        // Enter radius of the cylinder
        System.out.print("Enter the radius and length of a cylinder : ");//untuk print
        rad = sc.nextDouble();//menginput radius
        l = sc.nextDouble();//menginput length
        ar = hitungAr(rad);//mencari area
        vol = hitungVol(ar,l);//mencari voulume
        System.out.println("The area is " + ar);//mengeluarkan hasil
        System.out.println("The volume of the cylinder is " + vol);//mengeluarkan hasil
     
    }
    
    public static double hitungVol(double ar,double l)
    {
        return ar*l;
    }
    
    public static double hitungAr(double rad)
    {
        return rad*rad*3.14159;
    }
}