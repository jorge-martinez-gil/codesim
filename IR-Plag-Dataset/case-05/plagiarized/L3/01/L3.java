

public class L3 {

    public static void main(String[] args) 
    {
        int nomor = 0;
        System.out.print("Enter an integer: ");
        
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        nomor = input.nextInt();
        
        balik(nomor);
    }

    public static void balik(int nomor) {
        int sisa = 0 ;   
        while (nomor != 0)      
        {
                sisa = nomor % 10;
                System.out.print(sisa);
                nomor = nomor / 10;
        }
        System.out.println();
    }
}

