public class Periodico implements Producto {
    private String ID;
    private String nombre;
    private String fechaPublicacion;
    private double precio;

    public Periodico(String ID, String nombre, String fechaPublicacion, double precio) {
        this.ID = ID;
        this.nombre = nombre;
        this.fechaPublicacion = fechaPublicacion;
        this.precio = precio;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Periódico: " + nombre + "\nFecha de Publicación: " + fechaPublicacion + "\nID: " + ID +
                "\nPrecio: " + precio);
    }
}
