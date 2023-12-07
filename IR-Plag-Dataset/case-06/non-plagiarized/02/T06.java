
import java.util.Scanner;


/**
 *
 * @author 65FBEF05E01FAC390CB3FA073FB3E8CF (452BF208BF901322968557227B8F6EFE010)
 */
public class T06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a=new int[10];
        for(int i=0;i<10;i++){
            System.out.print("Read a number: ");
            a[i]=s.nextInt();
        }
        for(int i=9;i>=0;i--){
            System.out.println(a[i]);
        }
    }
}
