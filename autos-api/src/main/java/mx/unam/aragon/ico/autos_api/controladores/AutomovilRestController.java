package mx.unam.aragon.ico.autos_api.controladores;

import mx.unam.aragon.ico.autos_api.Servicios.AutomovilService;
import mx.unam.aragon.ico.autos_api.modelos.Automovil;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/autos")

public class AutomovilRestController {

    @Autowired
    private AutomovilService automovilService;

    @GetMapping("/")
    public ResponseEntity<List<Automovil>> getAutomovil(){
        return ResponseEntity.ok(automovilService.getAutomovil());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Automovil> getAutomovil(@PathVariable Long id) {

        //LoggerFactory.getILoggerFactory(AutomovilRestController.class).debug("getAutomovil: {}", id);
        //return ResponseEntity.ok(automovilService.getAutomovil(id));
        Automovil automovil = automovilService.getAutomovil(id);
        LoggerFactory.getLogger(AutomovilRestController.class).info("getAutomovil:" + automovil);
        return ResponseEntity.ok(automovil);
    }

    @PostMapping("/")
    public ResponseEntity<Automovil> createAutomovil(@RequestBody Automovil automovil) {
        return ResponseEntity.ok(automovilService.createAutomovil(automovil));
    }
}
