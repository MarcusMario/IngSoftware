package mx.pekesoft.ejemplo1.solucion;

import java.util.List;

public class ConversorListaArreglo {
    public double[] convertir(List<Double> datos) {
        double[] array = new double[datos.size()];
        for (int i = 0; i < datos.size(); i++) {
            array[i] = datos.get(i);
        }
        return array;
    }
}
