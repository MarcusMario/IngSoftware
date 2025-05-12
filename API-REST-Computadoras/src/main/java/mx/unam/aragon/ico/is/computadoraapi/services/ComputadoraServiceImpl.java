package mx.unam.aragon.ico.is.computadoraapi.services;

import mx.unam.aragon.ico.is.computadoraapi.entities.Computadora;
import mx.unam.aragon.ico.is.computadoraapi.repositories.ComputadoraRepository;
import mx.unam.aragon.ico.is.computadoraapi.services.interfaces.ComputadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

//Indicamos que es servicio
@Service
//Impl implementacion, implementamos metodos
public class ComputadoraServiceImpl implements ComputadoraService {
    @Autowired //Inyeccion de autodependencia
    private ComputadoraRepository computadoraRepository;



    @Override
    public Optional<Computadora> buscarPorId(Long id) {
        return computadoraRepository.findById(id);
    }

    @Override
    public Iterable<Computadora> listar() {
        return computadoraRepository.findAll();
    }

    @Override
    public Computadora crear(Computadora computadora) {
        return computadoraRepository.save(computadora);
    }

    @Override
    public Computadora actualizar(Long id, Computadora computadora) {
        Optional<Computadora> computadoraActual = computadoraRepository.findById(id);
        if (computadoraActual.isPresent()){
            Computadora compu = computadoraActual.get();
            compu.setModelo(computadora.getModelo());
            compu.setFoto(computadora.getFoto());
            compu.setMarca(computadora.getMarca());
            compu.setPrecio(computadora.getPrecio());
            return computadoraRepository.save(compu);
        }else{
            return null;
        }

    }

    @Override
    public Computadora eliminar(Long id) {
        return computadoraRepository.deleteByClave(id);
    }
}
