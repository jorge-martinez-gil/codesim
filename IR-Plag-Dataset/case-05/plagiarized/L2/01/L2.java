

public class L2 {

    public static void main(String[] args) 
    {
        System.out.print("Enter an integer: ");
        
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        int nomor = input.nextInt();
        
        balik(nomor);
    }

    public static void balik(int nomor) {
           while (nomor != 0)
        {
                int sisa = nomor % 10;
                System.out.print(sisa);
                nomor = nomor / 10;
        }
        System.out.println();
    }
}
