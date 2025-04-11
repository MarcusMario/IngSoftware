package mx.pekesoft.ejemplo1.solucion;

public class TransformadorDatos {
    public double[] transformar(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = arreglo[i] * 1.0;
        }
        return arreglo;
    }
}
