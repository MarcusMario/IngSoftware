package mx.unam.aragon.ico.is.plantasapi.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "plantas")
public class Planta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int clave;

    @Column(name="nombre_planta", columnDefinition = " VARCHAR(50) not null")
    @NotBlank(message = "NO SE ACEPTAN BLANCOS ")
    @NotNull(message = "NO SE ACEPTAN NULOS")
    private String nombre;

    @Column(name = "tipo_planta", columnDefinition = " VARCHAR(50) not null")
    @NotBlank(message = "NO SE ACEPTAN BLANCOS ")
    @NotNull(message = "NO SE ACEPTAN NULOS")
    private String tipo;

    @Column(name = "des_planta", columnDefinition = " VARCHAR(250) not null")
    @NotBlank(message = "NO SE ACEPTAN BLANCOS ")
    @NotNull(message = "NO SE ACEPTAN NULOS")
    private String descripcion;

    @Column(name = "foto_planta",nullable = true, insertable = false,updatable = true,columnDefinition = " VARCHAR(250) DEFAULT 'https://ciep.mx/wp-content/uploads/2019/09/placeholder.png'")
    private String foto;

    @Override
    public String toString() {
        return "Planta{" +
                "clave=" + clave +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", foto='" + foto + '\'' +
                '}';
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Planta(int clave, String nombre, String tipo, String descripcion, String foto) {
        this.clave = clave;
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.foto = foto;
    }

    public Planta() {
    }
}
