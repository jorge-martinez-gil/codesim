
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template fil3e, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 6968A2C57C3A4FEE8FADC79A80355E4D F13FFB0C4AF5E1CE7C646A5222FBC1E9 2451041557A22145B3701B0184109CAB035
 */
public class T05 {

    static int a;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int a = sc.nextInt();
        reverse(a);
    }

    public static void reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10;
            reverse = reverse + number % 10;
            number = number / 10;
        }
        System.out.println(reverse);
    }
}
