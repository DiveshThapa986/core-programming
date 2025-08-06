import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("principal: ");
        double p = sc.nextDouble();
        System.out.print("rate: ");
        double r = sc.nextDouble();
        System.out.print("time: ");
        double t = sc.nextDouble();
        double si = calculateSimpleInterest(p, r, t);
        System.out.println("simple interest is " + si);
    }
    public static double calculateSimpleInterest(double p, double r, double t){
        return (p * r * t) / 100;
    }
}
