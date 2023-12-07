
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
public class Level6 
{
    static Scanner sc = new Scanner(System.in);
    
    public static void tampil(int[]angka){
        for (int x = 10; x > 0; x--)
            System.out.println(angka[x]);
    }
    
    public static void main(String[] args) 
    {
        int arrAngka[] = new int[10];

        for (int x = 0; x < arrAngka.length; x++) 
        {
            System.out.print("Read a number: ");
            arrAngka[x] = sc.nextInt();
        }

        tampil(arrAngka);
    }
}
