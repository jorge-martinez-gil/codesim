/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CB6AB3315634A1E4D11B091BA48B60BA 7E51EEA5FA101ED4DADE9AD3A7A072BB 2F809B10D1ABEDBF2EC288F851B3EBBB
 */
public class T04 {
    public static void main(String[] args){
        
        System.out.println("Miles\tKilometers");
        
        for(int i = 1; i <= 10; i++){
            System.out.printf(i + "\t%.3f", (i * 1.609));
            System.out.println();
        }
        
    }
}
