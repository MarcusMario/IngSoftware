public class Libro implements Producto {
    private String ISBN;
    private String titulo;
    private String autor;
    private String resumen;
    private double precio;
    private int paginas;

    public Libro(String ISBN, String titulo, String autor, String resumen, double precio, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.resumen = resumen;
        this.precio = precio;
        this.paginas = paginas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Libro: " + titulo + "\nAutor: " + autor + "\nISBN: " + ISBN + "\nResumen: " + resumen +
                "\nPrecio: " + precio + "\nNúmero de Páginas: " + paginas);
    }
}
