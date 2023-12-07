/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author B15130F5DDB6B5F1622EF91DAC4C1AAE
 */
public class Kasus1L6 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Print Welcome to java 5 kali
        cetakTeks("Welcome to Java");
    }

    private static void cetakTeks(String teks) {
        int i = 5;
        while(i > 0){
            System.out.println(teks);
            i--;
        }
    }
}
