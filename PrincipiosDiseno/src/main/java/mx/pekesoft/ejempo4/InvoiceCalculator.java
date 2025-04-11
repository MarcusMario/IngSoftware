package mx.pekesoft.ejempo4;

public class InvoiceCalculator {

    public double computeBasicTotal(double subTotal, double taxRate) {
        double tax = subTotal * taxRate;
        double total = subTotal + tax;
        return total;
    }

    public double computeDiscountedTotal(double subTotal, double taxRate, double discount) {
        double tax = subTotal * taxRate;
        double total = subTotal + tax;
        total -= discount;
        return total;
    }

    public double computeTotalForUser(double subTotal, double taxRate, String userName) {
        double tax = subTotal * taxRate;
        double total = subTotal + tax;
        System.out.println("Usuario: " + userName);
        return total;
    }

    public static void main(String[] args) {
        InvoiceCalculator calculator = new InvoiceCalculator();
        double result1 = calculator.computeBasicTotal(100.0, 0.16);
        System.out.println("Total básico: " + result1);
        double result2 = calculator.computeDiscountedTotal(200.0, 0.16, 10.0);
        System.out.println("Total con descuento: " + result2);
        double result3 = calculator.computeTotalForUser(150.0, 0.16, "Alice");
        System.out.println("Total para usuario: " + result3);
    }
}
