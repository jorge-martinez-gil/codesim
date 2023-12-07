
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 6968A2C57C3A4FEE8FADC79A80355E4D F13FFB0C4AF5E1CE7C646A5222FBC1E9 2451041557A22145B3701B0184109CAB035
 */
public class T06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Read a number: ");
            array[i] = sc.nextInt();
        }

        System.out.println(array[9]);
        System.out.println(array[8]);
        System.out.println(array[7]);
        System.out.println(array[6]);
        System.out.println(array[5]);
        System.out.println(array[4]);
        System.out.println(array[3]);
        System.out.println(array[2]);
        System.out.println(array[1]);
        System.out.println(array[0]);

    }
}
