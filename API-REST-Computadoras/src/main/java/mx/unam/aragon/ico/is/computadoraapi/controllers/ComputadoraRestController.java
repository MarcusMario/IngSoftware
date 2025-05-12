package mx.unam.aragon.ico.is.computadoraapi.controllers;


import mx.unam.aragon.ico.is.computadoraapi.entities.Computadora;
import mx.unam.aragon.ico.is.computadoraapi.services.interfaces.ComputadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
//Postar Herramienta de desarrollador para probar API REST
//Indicamos que es controller


//Se copnecto el JPA, con el servicio y obtenemos las computadoras con el Controller
@RestController
@RequestMapping("/api/v1/computadoras")
public class ComputadoraRestController {

    //Inyectamos el Servicio, no necesitamos crear el objeto tal cual, gestiona el numero de copias del patron de diseño
    @Autowired
    private ComputadoraService computadoraService;


    @GetMapping("/")
    public ResponseEntity<Iterable<Computadora>> getComputadora(){
        return new ResponseEntity<>(computadoraService.listar(), HttpStatus.OK);
    }
    /*public Iterable<Computadora> getComputadora(){
        return computadoraService.listar();

    }*/

    //Solamente obtener un elemto / Variable de Ruta, se recupera con pathvariable
    @GetMapping("/{clave}")
    //Espera reponse entity
    public ResponseEntity<Computadora> getComputadoraPorClave(@PathVariable Long clave){
        //return computadoraService.buscarPorId(clave).orElse(null);  hacer constructor o metodo estatico
        //OPCION CONSTRUCTOR return new ResponseEntity<>(computadoraService.buscarPorId(clave).orElse(null), HttpStatus.OK);  Con estos si buscamos el un id inexistente nos arroja un 200 osea un ok cosa que no deberia, ya que deberia ser 404
        Optional<Computadora> tmp = computadoraService.buscarPorId(clave);
        if (tmp.isPresent()){
            return new ResponseEntity<>(tmp.get(),HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    //Post Method, se necesita los datos para ponerlos en la db, con RequestBody se recupera, acuerdate de guardar y volver a ejecutar despues de cada cambio
    @PostMapping("/")
    public ResponseEntity<Computadora> createComputadora(@RequestBody Computadora computadora){
        return  new ResponseEntity<>(computadoraService.crear(computadora), HttpStatus.CREATED);
    }

    //Metodo en caso de que quieran buscar con post
    //End point combinacion de url con un metodo
    @PostMapping("/{id}")
    public ResponseEntity<String> noExiste(){
        return new ResponseEntity<>("End Point no soportado", HttpStatus.NOT_FOUND);
    }

    //Put, modificacion de todo, patch modificacion de un registro

    @PatchMapping("/{clave}")
    public ResponseEntity<Computadora>
    actualizaParcial(@PathVariable Long clave, @RequestBody Computadora computadora){
        Computadora tmp = computadoraService.buscarPorId(clave).orElse(null);
        if (tmp != null){
            //Mandamos nullos para que no se mueva
            if(computadora.getMarca() != null) tmp.setMarca(computadora.getMarca());
            if(computadora.getModelo() != null) tmp.setModelo(computadora.getModelo());
            if(computadora.getPrecio() != null) tmp.setPrecio(computadora.getPrecio());
            if(computadora.getFoto() != null) tmp.setFoto(computadora.getFoto());
            return  new ResponseEntity<>(computadoraService.actualizar(clave, tmp), HttpStatus.OK);

        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }


//Metodo Editar API jackson mapea de json a java
    @PutMapping("/{clave}")
    public ResponseEntity<Computadora> edita(@PathVariable Long clave,
                                             @RequestBody Computadora computadora){
        Optional tmp = computadoraService.buscarPorId(clave);
        if (tmp.isPresent()){
            return new ResponseEntity<>(computadoraService.actualizar(clave,computadora),
                    HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

/*
    //Metodo Eliminar, por eso se hicieron pruebas unitarios, en el video no funciona
    @DeleteMapping("/{clave}")
    public ResponseEntity<Computadora>eliminar(@PathVariable Long clave){
        Computadora tmp = computadoraService.buscarPorId(clave).orElse(null);
        if (tmp != null){
            return new ResponseEntity<>(computadoraService.eliminar(clave), HttpStatus.OK);

        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
*/


    //Los errores 500 se deben evitar o le quita calidad a tu
    // sistema, estos se deben cachar en una excepcion, esto pasa al mandar un null y nosotros invalidarlo, tampoco se deben tener cadenas vacias.
    //Para arreglar esto nos vamos al POM y agregamos spring-boot-starter-validation

}
