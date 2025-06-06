package mx.unam.aragon.ico.is.plantasapi.controllers;

import mx.unam.aragon.ico.is.plantasapi.entities.Planta;
import mx.unam.aragon.ico.is.plantasapi.repositories.PlantaRepository;
import mx.unam.aragon.ico.is.plantasapi.services.interfaces.PlantaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;
import java.util.Optional;
@RestController
@RequestMapping("/api/v1/plantas")
public class PlantaRestController {

    @Autowired
    private PlantaService plantaService;

    // Listar todos
    @GetMapping
    public ResponseEntity<Iterable<Planta>> getPlanta() {
        return new ResponseEntity<>(plantaService.listar(), HttpStatus.OK);
    }

    // Buscar por ID
    @GetMapping("/{id}")
    public ResponseEntity<Planta> getPlantaByClave(@PathVariable Long clave) {
        Optional<Planta> tmp = plantaService.buscarPlantaPorId(clave);
        if (tmp.isPresent()) {
            return new ResponseEntity<>(tmp.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Agregar elementos
    @PostMapping
    public ResponseEntity<Planta> createPlanta(@RequestBody Planta planta) {
        return new ResponseEntity<>(plantaService.crear(planta), HttpStatus.CREATED);
    }

    // Modificacion completa PUT
    @PutMapping("/{id}")
    public ResponseEntity<Planta> editar(@PathVariable Long clave, @RequestBody Planta planta) {
        Optional<Planta> tmp = plantaService.buscarPlantaPorId(clave);
        if (tmp.isPresent()) {
            return new ResponseEntity<>(plantaService.actualizar(clave, planta), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Modificacion parcial PATCH
    @PatchMapping("/{id}")
    public ResponseEntity<Planta> actualizaParcial(@PathVariable Long clave, @RequestBody Planta planta){
        Planta tmp = plantaService.buscarPlantaPorId(clave).orElse(null);
        if (tmp != null) {
            if (planta.getNombre() != null) tmp.setNombre(planta.getNombre());
            if (planta.getDescripcion() != null) tmp.setDescripcion(planta.getDescripcion());
            if (planta.getTipo() != null) tmp.setTipo(planta.getTipo());
            if (planta.getFoto() != null) tmp.setFoto(planta.getFoto());
            return new ResponseEntity<>(plantaService.actualizar(clave, tmp), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Eliminar elemento
    @DeleteMapping("/{id}")
    public ResponseEntity<Planta> eliminar(@PathVariable Long clave) {
        Optional<Planta> tmp = plantaService.buscarPlantaPorId(clave);
        if (tmp.isPresent()) {
            return new ResponseEntity<>(plantaService.eliminar(clave), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    //validar error 404

    @GetMapping("/{id}")
    public ResponseEntity<Planta> getPlantaById(@PathVariable long clave) {
        Optional<Planta> planta = plantaService.buscarPlantaPorId(clave);
        if (planta.isEmpty()) {
            throw new NoSuchElementException("No se encontró la planta con clave " + clave);
        }
        return ResponseEntity.ok(planta.get());
    }

}
