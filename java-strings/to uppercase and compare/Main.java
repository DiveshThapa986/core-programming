import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("sentence: ");
        String original = sc.nextLine();
        String upper = original.toUpperCase();
        System.out.println("original: " + original);
        System.out.println("uppercase: " + upper);
        if (original.equals(upper)) {
            System.out.println("same");
        } else {
            System.out.println("case sensitive");
        }
    }
}
