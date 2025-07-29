import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); 
        if (n > 0) {
            long suml = 0;
            for (long i = 1; i <= n; i++) {
                suml += i;
            }
            long sumf = n * (n + 1) / 2;
            System.out.println("loop sum " + suml);
            System.out.println("formula sum " +  sumf);
        } else {
            System.out.println("enter positive number");
        }
    }
}
