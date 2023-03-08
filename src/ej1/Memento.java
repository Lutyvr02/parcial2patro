package ej1;

public class Memento {
    private  Documento estado;

    public Documento getEstado(){
        return estado;
    }

    public Memento(Documento estadoguardado){
        this.estado=estadoguardado;
    }
}
