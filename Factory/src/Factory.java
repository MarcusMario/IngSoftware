public class Factory {

    public Producto crearProducto(String tipo, String... atributos) {
        switch (tipo.toLowerCase()) {
            case "libro":
                return new Libro(atributos[0], atributos[1], atributos[2], atributos[3], Double.parseDouble(atributos[4]), Integer.parseInt(atributos[5]));
            case "revista":
                return new Revista(atributos[0], atributos[1], Integer.parseInt(atributos[2]), Double.parseDouble(atributos[3]), atributos[4]);
            case "periodico":
                return new Periodico(atributos[0], atributos[1], atributos[2], Double.parseDouble(atributos[3]));
            default:
                throw new IllegalArgumentException("Tipo de producto desconocido: " + tipo);
        }
    }
}
