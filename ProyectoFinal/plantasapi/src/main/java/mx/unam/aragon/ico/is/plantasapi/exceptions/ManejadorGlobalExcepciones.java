package mx.unam.aragon.ico.is.plantasapi.exceptions;


import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.NoSuchElementException;

@RestControllerAdvice
public class ManejadorGlobalExcepciones {
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<HashMap<String,String>> manejoDeRest(ConstraintViolationException ex){
        HashMap<String,String> respuesta = new HashMap<>();
        respuesta.put("Mensaje", ex.getLocalizedMessage());
        respuesta.put("timestam", LocalDateTime.now().toString());
        return new ResponseEntity<>(respuesta, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<HashMap<String,String>> manejoDeRest(HttpMessageNotReadableException ex){
        HashMap<String,String> respuesta = new HashMap<>();
        respuesta.put("Mensaje", ex.getLocalizedMessage());
        respuesta.put("timestam", LocalDateTime.now().toString());
        return new ResponseEntity<>(respuesta, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(org.springframework.web.bind.MethodArgumentNotValidException.class)
    public ResponseEntity<HashMap<String, String>> handleValidationErrors(org.springframework.web.bind.MethodArgumentNotValidException ex) {
        HashMap<String, String> errores = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error ->
                errores.put(error.getField(), error.getDefaultMessage()));
        errores.put("timestamp", LocalDateTime.now().toString());
        return new ResponseEntity<>(errores, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<HashMap<String,String>> manejoElementoNoEncontrado(NoSuchElementException ex){
        HashMap<String,String> respuesta = new HashMap<>();
        respuesta.put("Mensaje", ex.getMessage());
        respuesta.put("timestamp", LocalDateTime.now().toString());
        return new ResponseEntity<>(respuesta, HttpStatus.NOT_FOUND);
    }




}
