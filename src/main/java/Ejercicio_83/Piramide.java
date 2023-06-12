package Ejercicio_83;

public class Piramide extends FiguraGeometrica{
    private double base; 
    private double altura; 
    private double apotema; 

    public Piramide(double base, double altura, double apotema) {
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
        this.setVolumen(calcularVolumen()); /* Calcula el volumen y
        establece su atributo */
        this.setSuperficie(calcularSuperficie()); /* Calcula la superficie y
        establece su atributo */
    }
    public double calcularVolumen() {
        double volumen = (Math.pow(base, 2.0) * altura) / 3.0;
        return volumen;
    }
    public double calcularSuperficie() {
        double áreaBase = Math.pow(base, 2.0);
        double áreaLado = 2.0 * base * apotema;
        return áreaBase + áreaLado;
    }
}
