
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
public class T03 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter weight in pounds: ");
        int weight = sc.nextInt();
        System.out.print("Enter feet: ");
        int feet = sc.nextInt();
        System.out.print("Enter inches: ");
        int inches = sc.nextInt();
        
        int height = feet * 12 + inches;
        double bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254));
        
        System.out.println("BMI is " + bmi);
        
        if(bmi < 18.5){
            System.out.println("Underweight");
        }else if(bmi >= 18.5 && bmi < 25){
            System.out.println("Normal");
        }else if(bmi >= 35){
            System.out.println("Obese");
        }
        
    }
}
