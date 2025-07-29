import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("month: ");
        int m = sc.nextInt();
        System.out.print("day: ");
        int d = sc.nextInt();
        if ((m==3 && d>=20 && d<=31) ||(m==4 && d>=1 && d<=30) ||
        (m==5 && d>=1 && d<=31) ||(m==6 && d>=1 && d<=20))
        {
            System.out.println("spring season");
        } else {
            System.out.println("not a spring Season");
        }
    }
}
