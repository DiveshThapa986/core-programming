import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Physics marks:");
		int p = sc.nextInt();
		System.out.print("Chemistry marks:");
		int c = sc.nextInt();
		System.out.print("Maths marks:");
		int m = sc.nextInt();
		int total = p+c+m;
		double percentage = total/3.0;
		System.out.println("percentage: " + percentage);
		if(percentage>=80){
		    System.out.println("grade: A ");
		}
		else if(percentage>=70){
		    System.out.println("grade: B ");
		}
		else if(percentage>=60){
		    System.out.println("grade: C ");
		}
		else if(percentage>=50){
		    System.out.println("grade: D ");
		}
		else if(percentage>=40){
		    System.out.println("grade: E ");
		}
		else if(percentage<=39){
		    System.out.println("grade: R ");
		}
		
	}
}
