package mx.unam.aragon.ico.autos_api.modelos;

import jakarta.persistence.*;

import java.nio.file.LinkOption;

@Entity
@Table(name = "automoviles")

public class Automovil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;
    private String modelo;
    private String color;
    private String foto;


    public Automovil() {
    }

    public Automovil(Long id, String marca, String modelo, String color, String foto) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.foto = foto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", foto='" + foto + '\'' +
                '}';
    }
}
