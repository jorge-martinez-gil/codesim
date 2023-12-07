
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
    public static void main(String[] args) 
    {
        Scanner masukkan = new Scanner(System.in);
        double[][] mat = new double[4][4];
        
        System.out.print("Enter a 4 by 4 matrix row by row: ");
        for (int baris = 0; baris < 4; baris+=1) 
        {
            for (int kolom = 0; kolom < 4; kolom+=1) 
            {
                mat[baris][kolom] = masukkan.nextDouble();
            }
        }
        
        ngitung(mat);
    }

    public static void ngitung(double[][] matriks) 
    {
        double jumlah = 0;
        int i = 3;
        while(i >= 0){
            jumlah += matriks[i][i];
            i--;
        }
        System.out.print("Sum of the elements in the major diagonal is "+ jumlah);
    }
}
