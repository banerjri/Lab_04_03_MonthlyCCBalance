public class Main {
    public static void main(String[] args)
    {
        int intialBalance = 5000;
        double interestRate = 0.17;
        double interestMonth1;
        double interestMonth2;
        double balanceAfterMonth1;
        interestMonth1 = intialBalance * interestRate;
        System.out.println("The interest due after one month = " + interestMonth1);
        interestMonth2 = (intialBalance + interestMonth1) * interestRate;
        System.out.println("The interest due after two month = " + interestMonth2);
    }
}