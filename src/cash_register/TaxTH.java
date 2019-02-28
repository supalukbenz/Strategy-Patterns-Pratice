package flexible_cash_register;

public class TaxTH implements CalTax{
    @Override
    public double calculateTax(double purchase) {
        return purchase + (purchase*0.07);
    }
}
