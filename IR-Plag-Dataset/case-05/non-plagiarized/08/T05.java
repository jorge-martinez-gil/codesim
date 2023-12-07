
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 6ED61D4B80BB0F81937B32418E98ADCA A94652AA97C7211BA8954DD15A3CF838
 */
public class T05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = sc.nextInt();
        String b = String.valueOf(a);
        for (int i = 0; i < b.length(); i++) {
            System.out.print(b.charAt(b.length()-1-i));
        }
    }
}
