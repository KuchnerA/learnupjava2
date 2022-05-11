import kuchner.homework.finance.BankUtils;

public class Main {

    public static void main(String[] args) {

        String name = "Maxim";
        double accruedInterest = BankUtils.calcAccruedInterest(26, 70_000, 3.4);   //amount_RUB

        System.out.println("Накопленные проценты: " + accruedInterest + " RUB");

    }
}
