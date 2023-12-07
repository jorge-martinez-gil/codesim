/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
public class Kasus6 {
    
    public static void simpanArray(int[] arr, int i) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        if(i>0) {
            simpanArray(arr, --i);
            System.out.print("Read a number: ");
            arr[i] = sc.nextInt();
        }
        
    }
    
    public static void tampilArray(int[] arr, int i) {
        if(i>=0){
            System.out.println(arr[i]);
            tampilArray(arr, --i);
        }
    }
    
    public static void main(String[] args) {
        int n=10;
        int[] arr = new int[n];
        simpanArray(arr, n);
        tampilArray(arr, --n);
    }
}
