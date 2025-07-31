import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number: ");
        int number = sc.nextInt();
        int size = number/2+1;
        int[] odd = new int[size];
        int[] even = new int[size];
        int oddin = 0;
        int evenin = 0;
        for (int i=1;i<=number;i++){
            if (i%2==0){
                even[evenin]=i;
                evenin++;
            }
            else{
                odd[oddin] = i;
                oddin++;
            }
        }
        System.out.print("odd numbers: ");
        for (int i=0;i<oddin;i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();
        System.out.print("even numbers: ");
        for (int i=0;i<evenin;i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();
    }
}
