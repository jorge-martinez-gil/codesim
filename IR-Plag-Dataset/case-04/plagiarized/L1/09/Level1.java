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
        System.out.println("Miles\t\tKilometers");
        System.out.println("-------------------------------");

        int miles = 1;
        while (miles <= 10) 
        {
            System.out.println(miles + "\t\t" + miles * 1.609);
            miles++;
        }
    }
}
