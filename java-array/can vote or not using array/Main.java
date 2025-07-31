import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[10];
        for (int i=0;i<age.length;i++) {
            age[i] = sc.nextInt();
        }
        for (int i=0;i<age.length;i++){
            if (age[i]>=18){
                System.out.println("can vote");
            }
            else if (age[i]<=18){
                System.out.println("cannot vote");
            } 
        }
    }
}
