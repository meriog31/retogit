package ejercicio1POO;

import ejercicio1POO.LlamadaLocal;
import ejercicio1POO.LlamadaNacional;

public class Main {
    public static void main(String[]args){
        /*LlamadaLocal llamada1 = new LlamadaLocal(634817611,610610620,20);
        llamada1.mostrarDatos();
        LlamadaNacional llamada2 = new LlamadaNacional(634817611,610028023,20,'A');
        llamada2.mostrarDatos();
        System.out.println(llamada1.getCoste());
        System.out.println(llamada2.getCoste());
        */
        Centralita centralita = new Centralita();
        LlamadaLocal llamadaL1 = new LlamadaLocal(634817611,610610620,300);
        LlamadaLocal llamadaL2 = new LlamadaLocal(610610620,610028023, 400);
        centralita.agregarLocal(llamadaL1);
        centralita.agregarLocal(llamadaL2);
        LlamadaNacional llamadaN1 = new LlamadaNacional(612354869,635986745, 300, 'A');
        LlamadaNacional llamadaN2 = new LlamadaNacional(654321987,635241879, 500, 'B');
        centralita.agregarNacional(llamadaN1);
        centralita.agregarNacional(llamadaN2);
        llamadaL1.mostrarDatos();
        llamadaL2.mostrarDatos();
        llamadaN1.mostrarDatos();
        llamadaN2.mostrarDatos();
        System.out.println(centralita.getCosteAcumulado());
    }
}
