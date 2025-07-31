import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("rows: ");
        int r = sc.nextInt();
        System.out.print("cols: ");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("enter 2d array element:");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int[] arr = new int[r*c];
        int in = 0;
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[in] = matrix[i][j];
                in++;
            }
        }
        System.out.println("1d array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
