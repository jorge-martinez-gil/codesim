
public class Main {
    public static void printMil (){

        for(int i =1;i<=10;i++){
            System.out.println(i + "\t\t" + i * 1.609);

        }
    }
    public static void main(String[] args) {

        //Miles to kilometer
        System.out.println("Miles\t\tKilometers");
        System.out.println("-------------------------------");

        // Use while loop
        printMil();
    }
}
