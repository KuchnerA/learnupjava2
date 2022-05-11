package kuchner.homework.finance;

public class BankUtils {

    public static double calcAccruedInterest(int age, int amount, double rate) {
        int targetAge = 60;
        double accruedInterest = (targetAge - age) * (amount * rate / 100);

        return accruedInterest;
    }

}
