public class Main {
    public static void printMil (int mil){

            for(int i =1;i<=10;i++){
            System.out.println(mil + "\t\t" + mil * 1.609);


            mil++;
        }
    }
    public static void main(String[] args) {
        //declare MIL
        int mil=1;
        //Miles to kilometer
        System.out.println("Miles\t\tKilometers");
        System.out.println("-------------------------------");

        // Use while loop
        printMil(mil);
    }
}
