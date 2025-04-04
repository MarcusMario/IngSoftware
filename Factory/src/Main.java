public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        Producto libro = factory.crearProducto("libro", "978-0-123456-47-2", "Java para Todos", "Juan Pérez",
                "Un libro de introducción a Java", "300.00", "350");
        Producto revista = factory.crearProducto("revista", "ISSN 9876-5432", "Revista Mundo", "10",
                "60.00", "Mensual");
        Producto periodico = factory.crearProducto("periodico", "123", "El Diario", "2025-06-15", "30.00");

        libro.mostrarInformacion();
        revista.mostrarInformacion();
        periodico.mostrarInformacion();
    }
}
