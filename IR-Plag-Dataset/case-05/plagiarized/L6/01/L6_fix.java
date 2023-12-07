

public class L6_fix {

    public static void main(String[] args) 
    {
        int nomor, sisa = 0;
        System.out.print("Enter an integer: ");       
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        nomor = input.nextInt();
      
        
        while (nomor!=0)    
        {
            if (nomor!=0){
                sisa = nomor % 10;
                System.out.print(sisa);
                nomor = nomor / 10;}
        }
        System.out.println();
    }

}

