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
    
    public static void reverse(int number) {
		while (number != 0) {
			int remainder = number % 10;
			System.out.print(remainder);
			number = number / 10;
		}

		System.out.println();
	}
    
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        int number = input.nextInt();
        
        reverse(number);
    }
}
