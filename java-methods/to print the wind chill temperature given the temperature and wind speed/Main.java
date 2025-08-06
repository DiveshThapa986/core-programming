import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("temp in fahrenheit: ");
        double t = sc.nextDouble();
        System.out.print("wind speed: ");
        double windspeed = sc.nextDouble();
        double windchill = calculateWindChill(t, windspeed);
        System.out.println("wind chill temp: " + windchill);
    }
    public static double calculateWindChill(double t, double windspeed) {
        return 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(windspeed, 0.16);
    }
}
