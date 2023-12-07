
public class T4 {
	public static void main(String[] args) {
		System.out.println("Miles\t\tKilometers");
		System.out.println("-------------------------------");

		// Use while loop
		int miles = 1;
		while (miles <= 10) {
			System.out.println(miles + "\t\t" + miles * 1.609);
			miles++;
		}
	}

}
