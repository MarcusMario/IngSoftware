package mx.unam.aragon.ico.is.computadoraapi.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NonNull;

import java.util.Objects;

@Entity
@Table(name = "computadoras" )
//Lombok agrega getters, setters
//@Data
public class Computadora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Aut_Increment esto se actualiza por application,properties autoupdate
    private int clave;

    @Column (name = "marca computadora", nullable = false, length = 50)
    @NotBlank(message = "eres gallego o que, no se aceptan blancos") // Se personaliza mensaje
    @NotNull(message = "No deberia ser nullos")
    private String marca;

    //Sintaxis sql estandar
    @Column (name = "modelo computadora", columnDefinition = "VARCHAR(50) not null")
    private String modelo;

    @Column(name = "url_foto",
            nullable = true,
            insertable = false,
            columnDefinition = "VARCHAR(500) DEFAULT 'https://furntech.org.za/wp-content/uploads/2017/05/placeholder-image-300x225.png' ")
    private String foto;

    @Column(name = "precio pesos", nullable = true)
    private Float precio;


    public Computadora() {
    }

    public Computadora(int clave, String marca, String modelo, String foto, Float precio) {
        this.clave = clave;
        this.marca = marca;
        this.modelo = modelo;
        this.foto = foto;
        this.precio = precio;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    //Equals to hashh
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Computadora that = (Computadora) o;
        return clave == that.clave && Objects.equals(marca, that.marca) && Objects.equals(modelo, that.modelo) && Objects.equals(foto, that.foto) && Objects.equals(precio, that.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clave, marca, modelo, foto, precio);
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "clave=" + clave +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", foto='" + foto + '\'' +
                ", precio=" + precio +
                '}';
    }
}
