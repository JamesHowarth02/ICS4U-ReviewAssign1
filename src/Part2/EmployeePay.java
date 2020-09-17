package Part2;
import java.util.Scanner;

public class EmployeePay {
   
    public static double persistInput(String inputText, Scanner scanobj) {
        double numberInput = 0;
        System.out.print(inputText);
        try{
            numberInput = scanobj.nextDouble();
            if(numberInput>70 || numberInput < 1) {
                System.out.println("[!] Invalid input detected: please enter a number between 1 - 70.");
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
        int employee_amount = 5;
        double totalreg = 0;
        double totalot = 0;
        double grandtot = 0;
        Employee employees[] = new Employee[5];
        for (int i = 0; i < employee_amount; i++) {
            Employee employee = employees[i];
            employee = new Employee();
            double hoursInput = persistInput("Enter hours worked for Employee #" + (i + 1) + ": ", scanobj);
            employee.Calculate_Pay(hoursInput);
            employee.Print();
            totalreg += employee.RegularPay;
            totalot += employee.OvertimePay;
            grandtot += employee.TotalPay;
            System.out.println("=======================================");
        }
        System.out.println("Regular Pay: $" + totalreg);
        System.out.println("Overtime Pay: $" + totalot);
        System.out.println("Total Pay: $" + grandtot);
    }
}
