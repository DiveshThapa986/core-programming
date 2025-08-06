import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number of students: ");
        int n = sc.nextInt();
        int handshakes = calculateHandshakes(n);
        System.out.println("handshakes: " + handshakes);
    }
    public static int calculateHandshakes(int n){
        return (n*(n-1))/2;
    }
}
