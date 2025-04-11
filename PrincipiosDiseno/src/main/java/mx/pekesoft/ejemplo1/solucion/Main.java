package mx.pekesoft.ejemplo1.solucion;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> datos = Arrays.asList(10.0, 20.0, 30.0, 40.0);
        ProcesadorSimple procesador = new ProcesadorSimple();
        double resultado = procesador.procesar(datos);
        System.out.println("Resultado (versión simple): " + resultado);
    }
}
