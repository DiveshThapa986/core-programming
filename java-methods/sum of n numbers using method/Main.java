import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number: ");
        int n = sc.nextInt();
        int sum = findSum(n);
        System.out.println(sum);
    }
    public static int findSum(int n){
        int sum = 0;
        for (int i=1;i<=n;i++) {
            sum += i;
        }
        return sum;
    }
}

