package mx.pekesoft.ejemplo1;

import java.util.List;
import java.util.Arrays;
public class ProcesadorComplejo {

    public double metodoPrincipal(List<Double> datos) {
        double[] arreglo = metodoIntermedio(datos);
        arreglo = metodoSecundario(arreglo);
        return metodoInterno(arreglo);
    }


    private double[] metodoIntermedio(List<Double> datos) {
        double[] array = new double[datos.size()];
        for (int i = 0; i < datos.size(); i++) {
            array[i] = datos.get(i);
        }
        return array;
    }


    private double[] metodoSecundario(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = arreglo[i] * 1.0;
        }
        return arreglo;
    }


    private double metodoInterno(double[] arreglo) {
        double suma = 0;
        int contador = 0;
        for (double valor : arreglo) {
            if (valor != Double.NaN) {
                suma += valor;
                contador++;
            }
        }
        return (contador == 0) ? 0 : (suma / contador);
    }

    public static void main(String[] args) {
        ProcesadorComplejo procesador = new ProcesadorComplejo();
        List<Double> datos = Arrays.asList(10.0, 20.0, 30.0, 40.0);

        double resultado = procesador.metodoPrincipal(datos);
        System.out.println("Resultado (versión compleja): " + resultado);
    }
}
