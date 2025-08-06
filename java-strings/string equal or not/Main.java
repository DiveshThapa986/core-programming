import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("first string: ");
        String a = sc.nextLine();
        System.out.print("second string: ");
        String b = sc.nextLine();
        if (a.equals(b)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
