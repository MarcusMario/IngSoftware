package mx.pekesoft.ejemplo4.solucion;

public class DiscountCalculator extends InvoiceCalculator {

    public double computeDiscountedTotal(double subTotal, double taxRate, double discount) {
        double total = computeTaxedTotal(subTotal, taxRate);
        return total - discount;
    }
}
