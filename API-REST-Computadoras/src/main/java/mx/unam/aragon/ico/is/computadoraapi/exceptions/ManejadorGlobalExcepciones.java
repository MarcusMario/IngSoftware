package mx.unam.aragon.ico.is.computadoraapi.exceptions;

import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;

@RestControllerAdvice
public class ManejadorGlobalExcepciones {

    //Cachamos las excepeciones una por una como ConstraintViolationExcepttion

    @ExceptionHandler(ConstraintViolationException.class) // Declaramos objeto de la misma excepcion, lo ocupamos para mostrar el mensaje y dar informacion
    public ResponseEntity<HashMap<String, String>> manejoDeRest(ConstraintViolationException ex){
       //Hash map de string a string
        HashMap<String, String > respuesta = new HashMap<>();
        respuesta.put("mensaje", ex.getLocalizedMessage());
        respuesta.put("Timestam", LocalDateTime.now().toString());
        return  new ResponseEntity<>(respuesta,HttpStatus.BAD_REQUEST);
        //return new ResponseEntity<>(ex.getMessage(), HttpStatus.OK);
    }

    //Manejador excepcion con HashMap y codigo 200
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<HashMap<String, String>> manejoDeRest(HttpMessageNotReadableException ex){
        //Hash map de string a string
        HashMap<String, String > respuesta = new HashMap<>();
        respuesta.put("mensaje", ex.getLocalizedMessage());
        respuesta.put("Timestam", LocalDateTime.now().toString());
        respuesta.put("Estatus", HttpStatus.BAD_REQUEST.toString());
        return  new ResponseEntity<>(respuesta,HttpStatus.OK);
    }



}
