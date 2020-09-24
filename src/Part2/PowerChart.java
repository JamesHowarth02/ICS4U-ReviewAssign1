package Part2;

import java.util.Scanner;

public class PowerChart {
    public static int persistInput(String inputText, Scanner scanobj) {
        int numberInput = 0;
        System.out.print(inputText);
        try{
            numberInput = scanobj.nextInt();
            if(numberInput <0 || numberInput > 10) {
                System.out.println("[!] Invalid input detected: please enter a number between 0 - 10.");
                return persistInput(inputText, scanobj);
            }else{
               return numberInput; 
            }
        }catch(Exception e) {
            scanobj.next(); // You must supply this otherwise you enter an infinite recursive loop.
            System.out.println("[!] Invalid input detected: please enter a valid number.");
            return persistInput(inputText, scanobj);
        }
    }
    public static void main(String[] args) {
        Scanner scanobj = new Scanner(System.in);
        int Exponent = persistInput("Please enter the amount of rows for the chart: ", scanobj);
        System.out.format("%10s", "X");
        System.out.format("%10s", "2^X");
        System.out.println("");
        for (int i = 1; i <= 2; i++) {
            System.out.format("%10s","---");
        }
        for (int i = 1; i <= Exponent; i++) {
            System.out.println("");
            System.out.format("%10s", i);
            System.out.format("%10s", Math.pow(2, i));
        }
    } 
}
