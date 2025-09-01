import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of triangle (in inches): ");
        double baseInch = input.nextDouble();

        System.out.print("Enter height of triangle (in inches): ");
        double heightInch = input.nextDouble();
        double areaInches = 0.5 * baseInch * heightInch;
        double baseCm = baseInch * 2.54;
        double heightCm = heightInch * 2.54;
        double areaCm = 0.5 * baseCm * heightCm;
        System.out.println("The area of the triangle is " + areaInches + " square inches"
                         + " and " + areaCm + " square centimeters.");

        input.close();
    }
}
