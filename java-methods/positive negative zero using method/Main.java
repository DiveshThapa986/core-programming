import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("number: ");
        int n = sc.nextInt();
        int result = checkNumber(n);
        if (result==1) {
            System.out.println("positive");
        } 
        else if (result==-1){
            System.out.println("negative");
        } 
        else{
            System.out.println("zero");
        }
    }
    public static int checkNumber(int n) {
        if (n>0){
            return 1;
        } 
        else if (n<0){
            return -1;
        } 
        else{
            return 0;
        }
    }
}
