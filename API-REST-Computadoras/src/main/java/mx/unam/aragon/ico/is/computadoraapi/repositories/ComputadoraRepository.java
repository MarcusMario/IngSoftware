package mx.unam.aragon.ico.is.computadoraapi.repositories;

import mx.unam.aragon.ico.is.computadoraapi.entities.Computadora;
import org.springframework.data.repository.CrudRepository;
                                                            //Genericos va a manejar objetos computadora
public interface ComputadoraRepository extends CrudRepository<Computadora, Long> {


    public Computadora findComputadoraByClave(Long clave); //Meta informacion de la base de edatos e entidad, hibernate se encarga del select
    public Computadora deleteByClave(Long clave); // Lo necesitamos en ComputadoraService para eliminar
}
