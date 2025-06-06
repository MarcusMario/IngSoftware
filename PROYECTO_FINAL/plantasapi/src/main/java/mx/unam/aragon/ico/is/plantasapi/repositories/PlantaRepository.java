package mx.unam.aragon.ico.is.plantasapi.repositories;

import mx.unam.aragon.ico.is.plantasapi.entities.Planta;
import org.springframework.data.repository.CrudRepository;

public interface PlantaRepository extends CrudRepository<Planta, Long> {
    public Planta findPlantaByClave(Long id);
    public Planta deleteByClave(Long clave);
}
