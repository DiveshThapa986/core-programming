import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] h = new double[3];
        for (int i=0;i<3;i++) {
            System.out.print("age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("height of" + names[i] + ": ");
            h[i] = sc.nextDouble();
        }
        int yi = findYoungest(ages);
        int ti = findTallest(h);
        System.out.println("youngest is " + names[yi] + " age " + ages[yi]);
        System.out.println("tallest is " + names[ti] + " height " + h[ti]);
    }
    public static int findYoungest(int[] ages) {
        int minIndex = 0;
        for (int i=1;i<ages.length; i++) {
            if (ages[i]<ages[minIndex]) {
                minIndex=i;
            }
        }
        return minIndex;
    }
    public static int findTallest(double[] h) {
        int maxIndex = 0;
        for (int i=1;i<h.length;i++) {
            if (h[i]>h[maxIndex]) {
                maxIndex=i;
            }
        }
        return maxIndex;
    }
}
