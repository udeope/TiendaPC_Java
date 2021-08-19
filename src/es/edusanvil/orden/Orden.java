package es.edusanvil.orden;

import es.edusanvil.computadora.Computadora;

public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 5;
    
    public Orden(){
       this.idOrden = ++Orden.contadorOrdenes;
       this.computadoras = new Computadora[MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
        if(contadorComputadoras < MAX_COMPUTADORAS){
            this.computadoras[contadorComputadoras++] = computadora;
        } else {
            System.out.println("No puedes anadir mas computadoras");
        }
    }
    
    public void mostrarOrden(){
        System.out.println("idOrden: " + this.idOrden);
        System.out.println("Mostrar computadoras: ");
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(i + " - " + this.computadoras[i]);
        }
    }
}
