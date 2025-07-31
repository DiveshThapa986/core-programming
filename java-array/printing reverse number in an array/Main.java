import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number: ");
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while (temp != 0){
            count++;
            temp/= 10;
        }
        int[] digits = new int[count];
        temp = n;
        for (int i=count-1;i>=0;i--){
            digits[i]=temp%10;
            temp/=10;
        }
        System.out.print("reversed: ");
        for (int i=digits.length-1;i>=0;i--){
            System.out.print(digits[i]);
        }
    }
}
