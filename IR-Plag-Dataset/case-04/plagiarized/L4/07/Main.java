/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author E3AFED0047B08059D0FADA10F400C1E5
 */
public class Main {

    public static void main(String[] args) {
        int jarak;
        System.out.println("Miles\t\tKilometers");
        System.out.println("-------------------------------");
        // Di sini mengulang perhitungan jarak dalam mil dan kilometer
        jarak = 1;
        printJarakDalamMilDanKilo(jarak);
        
    }
   
    public static void printJarakDalamMilDanKilo(int jarak){
        while (jarak <= 10) {
            // Print hasil di sini sebanyak 10 kali
            System.out.println(jarak + "\t\t" + jarak * 1.609);
            jarak++;
        }
    }
}
