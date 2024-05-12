package ejercicio1POO;

public class LlamadaLocal {
    private long numeroOrigen;
    private long numeroDestino;
    private double coste;
    private double duracion;
    
    public LlamadaLocal (long numeroOrigen,long numeroDestino,double duracion){
        this.numeroOrigen = numeroOrigen;
        this.numeroDestino = numeroDestino;
        this.duracion = duracion;
        coste = duracion*0.15+0.5;
    }

    public long getNumeroOrigen() {
        return numeroOrigen;
    }
    public long getNumeroDestino() {
        return numeroDestino;
    }
    public double getCoste() {
        return coste;
    }
    public double getDuracion() {
        return duracion;
    }
    public void setNumeroOrigen(long numeroOrigen) {
        this.numeroOrigen = numeroOrigen;
    }
    public void setNumeroDestino(long numeroDestino) {
        this.numeroDestino = numeroDestino;
    }
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    public void setCoste(double coste) {
        this.coste = coste;
    }
    public void mostrarDatos(){
        System.out.println("La llamada se ha realizado desde el número "+numeroOrigen+" al número "+numeroDestino+", con una duración de "+duracion+" y un coste de "+coste);
    }
}
