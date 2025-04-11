package mx.pekesoft.ejemplo4.solucion;

public class InvoiceCalculator {

    public double computeTotal(double subTotal, double taxRate) {
        return computeTaxedTotal(subTotal, taxRate);
    }

    protected double computeTaxedTotal(double subTotal, double taxRate) {
        double tax = subTotal * taxRate;
        return subTotal + tax;
    }
}
