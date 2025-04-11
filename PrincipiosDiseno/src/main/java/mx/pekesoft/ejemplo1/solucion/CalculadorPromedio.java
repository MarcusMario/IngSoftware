package mx.pekesoft.ejemplo1.solucion;

public class CalculadorPromedio {
    public double promediar(double[] arreglo) {
        double suma = 0;
        int contador = 0;
        for (double valor : arreglo) {
            if (!Double.isNaN(valor)) {
                suma += valor;
                contador++;
            }
        }
        return (contador == 0) ? 0 : (suma / contador);
    }
}
