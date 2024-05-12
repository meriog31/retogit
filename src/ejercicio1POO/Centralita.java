package ejercicio1POO;

public class Centralita {
    private int costeAcumulado;
    public Centralita(){
        costeAcumulado = 0;
    }
    public void agregarLocal(LlamadaLocal llamadaL){
        costeAcumulado += (int) llamadaL.getCoste();
    }
    public void agregarNacional(LlamadaNacional llamadaN){
        costeAcumulado += (int) llamadaN.getCoste();
    }

    public int getCosteAcumulado() {
        return costeAcumulado;
    }
}
