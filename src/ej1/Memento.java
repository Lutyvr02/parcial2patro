package ej1;

public class Memento {

    public Documento getEstado(){
        return estado;
    }
    private  Documento estado;
    public Memento(Documento estadoguardado){
        this.estado=estadoguardado;
    }
}
