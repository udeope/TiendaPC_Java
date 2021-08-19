package test;

import es.edusanvil.computadora.Computadora;
import es.edusanvil.dispositivoentrada.Raton;
import es.edusanvil.dispositivoentrada.Teclado;
import es.edusanvil.monitor.Monitor;
import es.edusanvil.orden.Orden;

public class TestOrden {
    public static void main(String[] args) {
        Teclado teclado1 = new Teclado("Teclas", "Razer");
        Raton raton1 = new Raton("Raton", "Logitech");
        Monitor monitor1 = new Monitor("LG", 27.5);
        
        Computadora computadora1 = new Computadora("HP", monitor1, teclado1, raton1);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.mostrarOrden();
        
    }
    
}
