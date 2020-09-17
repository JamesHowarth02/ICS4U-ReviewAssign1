package Part2;


public class Employee {
    double Hours = 0;
    double RegWage = 15, OverWage = 22.50;
    double RegularPay, OvertimePay, TotalPay;
    
    public double Calculate_Pay(double hours) {
        Hours = hours;
        for (int i = 0; i < Hours; i++) {
            if(i>40) {
                TotalPay += OverWage;
                OvertimePay += OverWage;
            }else{
                TotalPay += OverWage;
                RegularPay += OverWage;
            }
        }
        return TotalPay;
    }
    
    public void Print() {
        System.out.println("Regular Pay: $" + RegularPay);
        System.out.println("Overtime Pay: $" + OvertimePay);
        System.out.println("Total Pay: $" + TotalPay);
    }
}
