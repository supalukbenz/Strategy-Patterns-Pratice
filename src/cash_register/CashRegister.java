package cash_register;

public class CashRegister {
    private double purchase; // total amount of product price bought
    private double payment;  // total amount of payment
    private CalTax calTax;

    public CashRegister(CalTax c) {
        this.purchase = 0;
        this.payment = 0;
        this.calTax = c;
    }

    public void recordPurchase(double amount) {
        purchase += amount;
    }

    public void calculateTax() {
        purchase = calTax.calculateTax(purchase);
    }

    public void enterPayment(double amount) {
        payment += amount;
    }

    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }
}
