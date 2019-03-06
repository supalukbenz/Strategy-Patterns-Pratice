package cash_register;

public class Main {

    public static void main(String[] args) {

        CashRegister registerPattern = new CashRegister(new TaxTH());
        registerPattern.recordPurchase(60);
        registerPattern.recordPurchase(40);
        registerPattern.calculateTax();
        registerPattern.enterPayment(200);
        System.out.println(registerPattern.giveChange());
    }
}
