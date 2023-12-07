public class Main {

    public static void main(String[] args) {
        //declare MIL
        int mil=1;
        //Miles to kilometer
        System.out.println("Miles\t\tKilometers");
        System.out.println("-------------------------------");

        // Use while loop
        while (mil <= 10) {

            System.out.println(mil + "\t\t" + mil * 1.609);


            mil++;
        }
    }
}
