/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author B15130F5DDB6B5F1622EF91DAC4C1AAE
 */
public class Kasus4L6 {

    public static void main(String[] args) {
        System.out.println("Miles\t\tKilometers");
        System.out.println("-------------------------------");
        ShowTable(10);
    }

    private static void ShowTable(int jumlahData) {
        for (int i = jumlahData; i >= 1; i--) {
            //Menampilkan hasil
            int temp = jumlahData + 1 - i;
            System.out.println(temp + "\t\t" + ConvertMilesToKilo(temp));
        }
    }

    private static double ConvertMilesToKilo(int miles) {
        return miles * 1.609;
    }
}
