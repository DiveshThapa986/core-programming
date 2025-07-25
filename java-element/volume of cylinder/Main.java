import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float radius=sc.nextFloat();
		float height=sc.nextFloat();
		double volume=3.14*radius*radius*height;
		System.out.print(volume);
	}
}
