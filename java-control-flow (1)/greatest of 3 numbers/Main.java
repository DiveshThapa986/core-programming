import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b && a>c){
		    System.out.print("a is largest");
		}
		else if(b>a && b>c){
		    System.out.print("b is largest");
		}
		else if(c>a && c>b){
		    System.out.print("c is largest");
		}
		else{
		    System.out.print("Numbers are equals");
		}
	}
}
