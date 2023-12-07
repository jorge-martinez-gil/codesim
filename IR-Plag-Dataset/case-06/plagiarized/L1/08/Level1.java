/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
public class Level1 
{
    public static void main(String[] args) 
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int[] num = new int[10];
        for (int i = 0; i < 10; i++) 
        {
            System.out.print(
                    "Read a number: ");
            num[i] = input.nextInt();
        }
        
        //tampilkan ke layar
        for (int i = 9; i >= 0; i--) 
        {
            System.out.println(num[i]);
        }
    }
}
