package Part1;

import java.util.Scanner;

/**
 *
 * @author jame1850
 */
public class PizzaCost1 {
    public static double persistInput(String inputText, Scanner scanobj) {
        double numberInput = 0;
        System.out.print(inputText);
        try{
            numberInput = scanobj.nextDouble();
            return numberInput;
        }catch(Exception e) {
            scanobj.next();
            System.out.println("[!] Invalid input detected.");
            return persistInput(inputText, scanobj);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double size = 0, toppings = 0, cost = 0, labor = 1.50, utilities = 0.75;
        
        size = persistInput("Please enter the diameter of the pizza > ", scan);
        toppings = persistInput("Please enter the amount of toppings > ", scan);

        cost = cost + labor; 
        cost = cost + utilities; 
        cost = cost + size * 0.5;
        cost = cost + toppings * 0.75; 
        
        System.out.println(String.format("Your pizza with cost: $%.2f", cost));
    }
}