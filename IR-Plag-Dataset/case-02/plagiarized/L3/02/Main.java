import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Enter radius of the cylinder
        double r=0;
        double len=0;
        double a =0;
        double volume=0;

        System.out.print("Enter the radius and length of a cylinder: ");
        r = scan.nextDouble();
        len = scan.nextDouble();

        a = r * r * 3.14159;
        volume = a * len;
        //Output
        System.out.println("The area is " + a);
        System.out.println("The volume of the cylinder is " + volume);

    }
}
