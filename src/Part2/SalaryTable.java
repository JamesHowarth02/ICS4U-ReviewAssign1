package Part2;

import java.text.NumberFormat;

public class SalaryTable {

    public static void main(String[] args) {
        double oldPay = 0;
        double basePay = 40000;
        double increase = 1.3;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        
        System.out.format("%10s", "YEAR");
        System.out.format("%15s", "OLD SALARY");
        System.out.format("%15s", "RAISE");
        System.out.format("%25s", "NEW SALARY\n");
        
        System.out.format("%10s", "----");
        System.out.format("%15s", "----------");
        System.out.format("%15s", "-----");
        System.out.format("%25s", "----------\n");
        
        for (int i = 1; i < 10; i++) {
            double raise = oldPay * increase;
            if(oldPay == 0) {
                oldPay = basePay;
                raise = basePay;
            }
            String oldPayText = formatter.format(oldPay);
            String raiseText = formatter.format(raise);
            String salaryText = formatter.format((oldPay + raise));
            System.out.format("%10s", i);
            System.out.format("%15s", oldPayText);
            System.out.format("%20s", raiseText);
            System.out.format("%20s", salaryText + "\n");
            oldPay = oldPay + raise;
        }
    }
}
