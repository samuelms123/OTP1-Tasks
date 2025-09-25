import java.util.Scanner;

public class TimeCal {
    public static double calculateTime(double x, double v) {
        return Math.round(x / v);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in km: ");
        double distance = sc.nextDouble();
        System.out.println("Enter speed in kmh/h: ");
        double speed = sc.nextDouble();
        System.out.println("Required time for the distance: " + calculateTime(distance, speed));

    }
}
