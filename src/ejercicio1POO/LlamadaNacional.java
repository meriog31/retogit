package ejercicio1POO;

import ejercicio1POO.LlamadaLocal;

public class LlamadaNacional extends LlamadaLocal {

    private char destino;

    public LlamadaNacional(long numeroOrigen, long numeroDestino, double duracion,char destino) {
        super(numeroOrigen, numeroDestino, duracion);
        this.destino = destino;
        calcularCoste();
    }

    public char getDestino() {
        return destino;
    }

    @Override
    public long getNumeroOrigen() {
        return super.getNumeroOrigen();
    }

    @Override
    public long getNumeroDestino() {
        return super.getNumeroDestino();
    }

    @Override
    public double getDuracion() {
        return super.getDuracion();
    }

    @Override
    public double getCoste() {
        return super.getCoste();
    }

    @Override
    public void setNumeroOrigen(long numeroOrigen) {
        super.setNumeroOrigen(numeroOrigen);
    }

    @Override
    public void setNumeroDestino(long numeroDestino) {
        super.setNumeroDestino(numeroDestino);
    }

    @Override
    public void setDuracion(double duracion) {
        super.setDuracion(duracion);
    }

    public void setDestino(char destino) {
        this.destino = destino;
    }

    @Override
    public void setCoste(double coste) {
        super.setCoste(coste);
    }
    public void calcularCoste(){
        switch (destino){
            case 'A':
                setCoste(getDuracion() * 0.4 + 0.7);
                break;
            case 'B':
                setCoste(getDuracion()*0.5+0.7);
                break;
            case 'C':
                setCoste(getDuracion()*0.6+0.7);
                break;
            default:
                System.out.println("El destino indicado no es correcto");
        }
    }
}
