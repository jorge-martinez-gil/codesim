import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Enter radius of the cylinder    

        System.out.print("Enter the radius and length of a cylinder: ");
        double r = scan.nextDouble();
        double len = scan.nextDouble();
        double a = r * r * 3.14159;
        double volume = a * len;
        //Output
        System.out.println("The area is " + a);
        System.out.println("The volume of the cylinder is " + volume);

    }
}
  