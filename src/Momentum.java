import java.util.Scanner;

/***
 *
 * @author jame1850
 */
public class Momentum {

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
        double mass, velocity, momentum;
        
        mass = persistInput("Please input the mass: ", scan);
        velocity = persistInput("Please input the velocity: ", scan);
        
        momentum = mass * velocity;
        System.out.println(String.format("Calculated Momentum is: %.2f", momentum));
    }
    
}
