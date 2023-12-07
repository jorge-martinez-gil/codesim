

/**
 *
 * @author 020A6EC1A4D0C5BDB29FF826A462DA1C5D88CF08B60A4744AFFD95C61A0C3C7E
 */
public class Main {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int[] nums = new int[10];
        
        for (int i = 0; i < 10; i++) {
            //Read a number
            System.out.print(
                    "Read a number: ");
            nums[i] = input.nextInt();
        }
        
        //Display the array
        for (int i = 9; i >= 0; i--) {
            System.out.println(nums[i]);
        }
    }
}
