import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("dividend: ");
        int n = sc.nextInt();
        System.out.print("divisor: ");
        int divisor = sc.nextInt();
        int[] result = findRemainderAndQuotient(n, divisor);
        System.out.println("q: " + result[0]);
        System.out.println("r: " + result[1]);
    }
    public static int[] findRemainderAndQuotient(int n, int divisor) {
        int q = n / divisor;
        int r = n % divisor;

        return new int[]{q, r};
    }
}
