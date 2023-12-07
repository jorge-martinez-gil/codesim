
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
public class T07 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        double[][] m = new double[4][4];
        
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                m[i][j] = sc.nextDouble();
            }
        }
        
        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(m));
        
    }
    
    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;
        for(int i = 0; i < m.length; i++){
            sum += m[i][i];
        }
        return sum;
    }
}
