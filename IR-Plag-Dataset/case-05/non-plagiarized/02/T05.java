
import java.util.Scanner;

/**
 *
 * @author 65FBEF05E01FAC390CB3FA073FB3E8CF (452BF208BF901322968557227B8F6EFE010)
 */
public class T05 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int a = s.nextInt();
        reverse(a);
    }

    public static void reverse(int number) {
        String temp=String.valueOf(number);
        for(int i=temp.length();i>0;i--){
            System.out.print(temp.charAt(i-1));
        }
    }
}
