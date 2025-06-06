package mx.unam.aragon.ico.is.plantasapi.services;

import jakarta.persistence.Table;
import mx.unam.aragon.ico.is.plantasapi.entities.Planta;
import mx.unam.aragon.ico.is.plantasapi.repositories.PlantaRepository;
import mx.unam.aragon.ico.is.plantasapi.services.interfaces.PlantaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class PlantaServiceImpl implements PlantaService {


    @Autowired
    private PlantaRepository plantaRepository;

    @Override
    public Optional<Planta> buscarPlantaPorId(Long clave) {
        return plantaRepository.findById(clave);
    }

    @Override
    public Iterable<Planta> listar() {
        return plantaRepository.findAll();
    }

    @Override
    public Planta crear(Planta planta) {
        return plantaRepository.save(planta);
    }

    @Override
    public Planta actualizar(Long clave, Planta planta) {
        Optional<Planta> plantaActual = plantaRepository.findById(clave);
        if(plantaActual.isPresent()) {
            Planta plan = plantaActual.get();
            plan.setNombre(planta.getNombre());
            plan.setDescripcion(planta.getDescripcion());
            plan.setTipo(planta.getTipo());
            plan.setFoto(planta.getFoto());
            return plantaRepository.save(planta);
        }else{
            return null;

        }
    }

    @Override
    public Planta eliminar(Long clave) {
        return plantaRepository.deleteByClave(clave);
    }
}
