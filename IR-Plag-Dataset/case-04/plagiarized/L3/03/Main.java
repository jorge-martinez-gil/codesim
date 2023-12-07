

/**
 *
 * @author 020A6EC1A4D0C5BDB29FF826A462DA1C5D88CF08B60A4744AFFD95C61A0C3C7E
 */
public class Main {

    public static void main(String[] args) {
        int mile = 1;
        System.out.println("Miles\t\tKilometers");
        System.out.println("-------------------------------");
        
        //Use while loop
        while (mile <= 10) {
                System.out.println(mile + "\t\t" + mile * 1.609);
                mile++;
        }
    }
}
