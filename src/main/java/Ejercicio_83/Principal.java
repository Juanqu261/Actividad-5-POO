package Ejercicio_83;

public class Principal {
    public static void main(String[] args) {
        VentanaPrincipal miVentanaPrincipal; /* Define la ventana
        principal */
        miVentanaPrincipal= new VentanaPrincipal(); /* Crea la ventana
        principal */
        miVentanaPrincipal.setVisible(true); /* Establece la ventana
        como visible */
        // Establece que la ventana no puede cambiar su tamaño
        miVentanaPrincipal.setResizable(false);
    }
}
