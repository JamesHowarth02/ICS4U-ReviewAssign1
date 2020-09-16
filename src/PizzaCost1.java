import java.util.Scanner;

/**
 *
 * @author jame1850
 */
public class PizzaCost1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double size = 0, toppings = 0, cost = 0, labor = 1.50, utilities = 0.75;
        
        System.out.println("Please enter the diameter of the pizza > ");
        size = scan.nextDouble();
        System.out.println("Please enter the amount of toppings > ");
        toppings = scan.nextInt();

        cost = cost + labor; 
        cost = cost + utilities; 
        cost = cost + size * 0.5;
        cost = cost + toppings * 0.75; 
        
        System.out.println(String.format("Your pizza with cost: $%.2f", cost));
    }
}