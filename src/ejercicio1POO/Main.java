package ejercicio1POO;

import ejercicio1POO.LlamadaLocal;
import ejercicio1POO.LlamadaNacional;

public class Main {
    public static void main(String[]args){
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
