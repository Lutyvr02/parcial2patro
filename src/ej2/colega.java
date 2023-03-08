package ej2;

public abstract class colega {
    protected ican ca;
    public colega(ican ca){
        this.ca = ca;
    }
    public abstract void enviar(String mensaje);
    public abstract void recibio(String mensaje);
}
