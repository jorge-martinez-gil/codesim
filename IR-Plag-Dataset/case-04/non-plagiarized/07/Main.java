

/**
 *
 * @author C2FE677A63FFD5B7FFD8FACBF327DAD0
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int miles = 1;
        System.out.print("Miles    Kilometer");
        for(int i=0;i<10;i++)
        {
            double kilo = miles*1.609;
            System.out.println("");
            System.out.print(miles+"        "+kilo);
            miles++;

        }
        
    }
    
}
