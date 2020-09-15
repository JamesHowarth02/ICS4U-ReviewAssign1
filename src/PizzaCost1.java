
import java.util.Scanner;

/**
 *
 * @author jame1850
 */
public class PizzaCost1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double labor = 1.5;
        final double heat = 0.75;
        int toppings;
        double size;
        double total;
        
        System.out.println("Please input the desired size(inches): ");
        size = scan.nextDouble();
        System.out.println("Please input the amount of toppings: ");
        toppings = scan.nextInt();
        
        total = size * toppings + labor + heat;
    }
}