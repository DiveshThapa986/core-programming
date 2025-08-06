import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  string: ");
        String input = sc.nextLine();
        int count = 0;
        while (true) {
            try {
                input.charAt(count);
                count++;
            } catch (Exception e) {
                break;
            }
        }
        System.out.println("length of string: " + count);
    }
}
