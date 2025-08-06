import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("word: ");
        String text = sc.nextLine();
        System.out.print("enter index: ");
        int index = sc.nextInt();
        System.out.println(" ch at index " + index + ": " + text.charAt(index));
    }
}
