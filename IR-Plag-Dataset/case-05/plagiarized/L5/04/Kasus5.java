/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
public class Kasus5 {
    
    public static int reverse(int number) {
        return number%10;
    }
    
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        int number = input.nextInt();
        
        for( ; number>0 ; number/=10)
            System.out.print(reverse(number));
        System.out.println("");
    }
}
