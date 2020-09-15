import java.util.Scanner;

/***
 *
 * @author jame1850
 */
public class Momentum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mass, velocity, momentum;
        
        System.out.println("Please input the mass: ");
        mass = scan.nextDouble();
        System.out.println("Please input the velocity: ");
        velocity = scan.nextDouble();
        
        momentum = mass * velocity;
        System.out.println(String.format("Calculated Momentum is: %.2f", momentum));
    }
    
}
