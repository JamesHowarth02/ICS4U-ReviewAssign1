package Part2;

import java.util.Scanner;

public class Divide {
    public static int persistInput(String inputText, Scanner scanobj) {
        int numberInput = 0;
        System.out.print(inputText);
        try{
            numberInput = scanobj.nextInt();
            return numberInput;
        }catch(Exception e) {
            scanobj.next(); // You must supply this otherwise you enter an infinite recursive loop.
            System.out.println("[!] Invalid input detected: please enter a valid number.");
            return persistInput(inputText, scanobj);
        }
    }
    public static void main(String[] args) {
        Scanner scanobj = new Scanner(System.in);
        int firstNumber = persistInput("[?] Please enter the first number: ", scanobj);
        int secondNumber = persistInput("[?] Please enter the second number: ", scanobj);
        
        int largernumber = Math.max(firstNumber, secondNumber);
        int smallernumber = Math.min(firstNumber, secondNumber);
        
        int quotient = largernumber/smallernumber;
        int remainder = largernumber%smallernumber;
        
        System.out.format("Quotient: %d\n", quotient);
        System.out.format("Remainder: %d\n", remainder);
    }  
}
