package mx.pekesoft.ejemplo1.solucion;

import java.util.List;

public class ProcesadorSimple {
    private final ConversorListaArreglo conversor = new ConversorListaArreglo();
    private final TransformadorDatos transformador = new TransformadorDatos();
    private final CalculadorPromedio calculador = new CalculadorPromedio();

    public double procesar(List<Double> datos) {
        double[] arreglo = conversor.convertir(datos);
        double[] transformados = transformador.transformar(arreglo);
        return calculador.promediar(transformados);
    }
}
