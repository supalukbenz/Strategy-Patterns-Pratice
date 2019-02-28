package flexible_cash_register;

public class TaxCA implements CalTax{
    @Override
    public double calculateTax(double purchase) {
        return purchase + (purchase*0.075);
    }
}
