package mx.unam.aragon.ico.autos_api.Servicios;

import mx.unam.aragon.ico.autos_api.modelos.Automovil;

import java.util.List;

public interface AutomovilService {
    public List<Automovil> getAutomovil();
    public Automovil getAutomovil(Long id);
    public Automovil createAutomovil(Automovil automovil);
}
