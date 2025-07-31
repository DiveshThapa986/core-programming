import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        int[] heights = new int[3];
        for (int i=0;i<3;i++){
            System.out.print("age: ");
            ages[i] = sc.nextInt();
            System.out.print("height: ");
            heights[i] = sc.nextInt();
        }
        int minin = 0;
        int maxin = 0;
        for (int i=1;i<3;i++){
            if (ages[i]<ages[minin]) {
                minin = i;
            }
            if (heights[i]>heights[maxin]) {
                maxin = i;
            }
        }
        System.out.println("youngest age: " + ages[minin]);
        System.out.println("tallest height: " + heights[maxin]);
    }
}
