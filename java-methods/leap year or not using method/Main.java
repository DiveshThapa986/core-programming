import java.util.*;
public class Main{
    public static void checkLeapYear(int year){
        if (year<1582){
            System.out.println("year before 1582");
        } 
        else{
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                System.out.println("leap year");
            } 
            else{
                System.out.println("not a leap year");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("year: ");
        int year = sc.nextInt();
        checkLeapYear(year);
    }
}
