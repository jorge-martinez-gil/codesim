
public class L5 {

    public static void print(int mil)
    {
          for ( int i = 0 ; i < 10 ; i ++){

            System.out.println(mil + "\t\t" + mil * 1.609);
            mil++;

        }
    }
    public static void main(String[] args) {
        
        int mil = 1 ;
        System.out.println("Miles\t\tKilometers");
        
        System.out.println("-------------------------------");

        print(mil);

    }
}
