
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 685903EF83F7A7C8A165F77EED160D9E
 */
public class T05 {
    public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          System.out.print("Enter an integer ");
          int a= s.nextInt();
          reverse(a);
    }
    public  static  void reverse(int number){
        String cek = String.valueOf(number);
        for (int i = 0; i < cek.length(); i++) {
            System.out.print(cek.charAt(cek.length()-1-i));
        }
        System.out.println("");
    }
}
