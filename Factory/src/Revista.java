public class Revista implements Producto {
    private String ISSN;
    private String nombre;
    private int edicion;
    private double precio;
    private String periodicidad;

    public Revista(String ISSN, String nombre, int edicion, double precio, String periodicidad) {
        this.ISSN = ISSN;
        this.nombre = nombre;
        this.edicion = edicion;
        this.precio = precio;
        this.periodicidad = periodicidad;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Revista: " + nombre + "\nEdición: " + edicion + "\nISSN: " + ISSN + "\nPrecio: " + precio +
                "\nPeriodicidad: " + periodicidad);
    }
}

