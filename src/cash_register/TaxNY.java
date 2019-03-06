package cash_register;

public class TaxNY implements CalTax {
    @Override
    public double calculateTax(double purchase) {
        if (purchase > 100)
            return purchase + (purchase*0.08);
        return 0;
    };
}
