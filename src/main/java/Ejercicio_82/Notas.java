package Ejercicio_82;

public class Notas {
    double[] listaNotas; /* Atributo que identifica un array de notas de
    tipo double */
    
    public Notas() {
        listaNotas = new double[5]; // Crea un array de 5 notas
    }
    double calcularPromedio() {
        double suma = 0;
        for(int i=1; i < listaNotas.length; i++) { // Se recorre el array
            suma = suma + listaNotas[i]; // Suma las notas del array
        }
        return (suma / listaNotas.length);
    }
    double calcularDesviación() {
        double prom = calcularPromedio(); 
        double suma = 0;
        for(int i=0; i < listaNotas.length; i++) {
            suma += Math.pow(listaNotas[i] - prom, 2 );
        }
        return Math.sqrt (suma/listaNotas.length ); 
    }
    double calcularMenor() {
        double menor = listaNotas[0];
        for(int i=0; i < listaNotas.length; i++) { // Se recorre el array
            if (listaNotas[i] < menor) {
                menor = listaNotas[i];
            }
        }
        return menor;
    }
    double calcularMayor() {
        double mayor = listaNotas[0]; /* Define una variable como la
        nota mayor */
        for(int i=0; i < listaNotas.length; i++) { // Se recorre el array
            if (listaNotas[i] > mayor) {
                mayor = listaNotas[i];
            }
        }
        return mayor;
    }
}
