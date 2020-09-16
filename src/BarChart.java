import java.awt.Color;
import java.util.Scanner;
import BreezySwing.*;
import TurtleGraphics.*;

public class BarChart {

    
    public static void axisBar(Pen pen) {
        pen.up();
        pen.move(-550, -230);
        pen.setDirection(0);
        pen.setColor(Color.BLACK);
        pen.setWidth(10);
        pen.down();
        pen.move(550, -230);
    }
    
    public static void makeBar(Pen pen, int xLoc, int yLoc, int Length, Color color) {
        pen.up();
        pen.move(xLoc, yLoc);
        pen.down();
        pen.setWidth(20);
        pen.setColor(color);
        pen.setDirection(90);
        pen.move(Length);
        pen.up();
        pen.move(15);
        pen.down();
        pen.drawString(Length + "");
    }
    
    public static int persistInput(String inputText, Scanner scanobj) {
        int numberInput = 0;
        System.out.print(inputText);
        try{
            numberInput = scanobj.nextInt();
            return numberInput;
        }catch(Exception e) {
            scanobj.next();
            System.out.println("[!] Invalid input detected.");
            return persistInput(inputText, scanobj);
        }
    }

    public static void main(String[] args) {
        SketchPadWindow sketchpad = new SketchPadWindow(500, 500);
        Pen pen = new StandardPen(sketchpad);
        Scanner scanobj = new Scanner(System.in);
        Color colors[] = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW};
        int barIndex = 0;
        int xLoc = -125;
        int yLoc = -215;
        
        axisBar(pen);
        while (barIndex != 4) {
            int Length = 0;
            xLoc = xLoc + 50;
            barIndex = barIndex + 1;
            Length = persistInput("[?] Please enter an integer for Length " + barIndex + "> ", scanobj);
            makeBar(pen, xLoc, yLoc, Length, colors[barIndex-1]);
        }
        System.out.println("[*] Success, please check the SketchPadWindow.");
    }
}
