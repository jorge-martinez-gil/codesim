

import java.util.Scanner;

/**
 *
 * @author 2645BB47F923271FA1FC06C04E9691EA
 */
public class Soal6 {
    public static void reverse(String number){
        
        for(int i = number.length()-1; i>-1; i--){
            System.out.println(number.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String input = "";
        int a;
        for (int i = 0; i < 10; i++) {
            System.out.print("Read a number: ");
            a = sc.nextInt();
            input+=a;
        }
        reverse(input);
    }
}
