
public class L2_6 {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] angka = new int[10];
        
        for (int i = 0; i < 10; i++) 
        {

            System.out.print("Read a number: ");
            angka[i] = sc.nextInt();
        }

        for (int i = 9; i >= 0; i--)
        {
            
            System.out.println(angka[i]);
        }
    }
}
