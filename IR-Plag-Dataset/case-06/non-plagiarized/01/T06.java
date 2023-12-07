
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CB6AB3315634A1E4D11B091BA48B60BA 7E51EEA5FA101ED4DADE9AD3A7A072BB 2F809B10D1ABEDBF2EC288F851B3EBBB
 */
public class T06 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int[] input = new int[10];
        
        for(int i = 0; i < input.length; i++){
            System.out.print("Read a number: ");
            input[i] = sc.nextInt();
        }
        
        for(int i = 9; i >= 0; i--){
            System.out.println(input[i]);
        }
        
    }
}
