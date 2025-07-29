import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number: ");
        int n = sc.nextInt();
        int count = 0;
        for (int i=2;i<n;i++){
            if (n%i==0){
                count++;
            }
        }
        if (count==0){
            System.out.println("prime number");
        }
        else{
            System.out.println("not a prime number");
        }
    }
}
