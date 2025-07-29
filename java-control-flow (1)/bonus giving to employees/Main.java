import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("salary: ");
        double salary = sc.nextDouble();
        System.out.print("years: ");
        int years = sc.nextInt();
        double bonus = 0.0;
        if (years>5){
            bonus=salary*0.05;
        } 
        else{
            bonus=0.0;
        }
        System.out.println("bonus: " + bonus);
    }
}
