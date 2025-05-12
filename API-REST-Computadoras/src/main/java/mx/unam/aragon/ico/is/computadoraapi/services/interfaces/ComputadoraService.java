package mx.unam.aragon.ico.is.computadoraapi.services.interfaces;

import mx.unam.aragon.ico.is.computadoraapi.entities.Computadora;

import java.util.Optional;

public interface ComputadoraService {

    //Estructura de metodos, conectamos a la bd con computadoraTest
    public abstract Optional<Computadora> buscarPorId(Long id);
    public abstract Iterable<Computadora> listar();
    public abstract Computadora crear (Computadora computadora);
    public abstract Computadora actualizar(Long id,Computadora computadora);
    public abstract Computadora eliminar(Long id);

    //long primitivo, Long wrapped


}
