package mx.pekesoft.ejemplo4.solucion;

public class Aplicacion {
    public static void main(String[] args) {
        InvoiceCalculator calc = new InvoiceCalculator();
        DiscountCalculator disc = new DiscountCalculator();
        UserDisplayService display = new UserDisplayService();

        double result1 = calc.computeTotal(100.0, 0.16);
        System.out.println("Total básico: " + result1);

        double result2 = disc.computeDiscountedTotal(200.0, 0.16, 10.0);
        System.out.println("Total con descuento: " + result2);

        double result3 = calc.computeTotal(150.0, 0.16);
        display.showUser("Alice", result3);
    }
}
