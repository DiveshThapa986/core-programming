import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number: ");
        int n = sc.nextInt();
        int[] f = new int[n];
        int in = 0;
        for (int i=1;i<=n;i++){
            if (n%i==0) {
                f[in]=i;
                in++;
            }
        }
        System.out.println("factors are: ");
        for (int i=0;i<in;i++){
            System.out.print(f[i] + " ");
        }
    }
}
