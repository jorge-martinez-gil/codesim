
/**
 *
 * @author 65FBEF05E01FAC390CB3FA073FB3E8CF (452BF208BF901322968557227B8F6EFE010)
 */
public class T04 {

    public static void main(String[] args) {
        System.out.println("Miles       Kilometers");
        for (int i = 1; i <= 10; i++) {
            if (i == 10) {
                System.out.println(i + "          " + i * 1609);
            } else {
                System.out.println(i + "           " + i * 1609);
            }
        }
    }
}
