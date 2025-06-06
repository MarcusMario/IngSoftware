package mx.unam.aragon.ico.is.plantasapi.services.interfaces;

import mx.unam.aragon.ico.is.plantasapi.entities.Planta;

import java.util.List;
import java.util.Optional;

public interface PlantaService {
    public abstract Optional<Planta> buscarPlantaPorId(Long clave);
    public abstract Iterable<Planta> listar();
    public abstract  Planta crear(Planta planta);
    public abstract Planta actualizar(Long clave,Planta planta);
    public abstract Planta eliminar(Long clave);
}
