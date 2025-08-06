import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("sentence: ");
        String original = sc.nextLine();
        String lower = original.toLowerCase();
        System.out.println("original: " + original);
        System.out.println("lowercase: " + lower);
        if (original.equals(lower)){
            System.out.println("same");
        } else {
            System.out.println("case sensitive");
        }
    }
}
