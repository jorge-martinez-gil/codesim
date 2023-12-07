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
        String input = "Welcome to Java\n";
        keluaran(input);
    }
    
    private static void keluaran(String kal) 
    {
        int limit=0; //batas perulangan
        while(limit!=5) //perulangan sebanyak 5x
        {
            System.out.print(kal);
            limit++;
        }
    }
}
