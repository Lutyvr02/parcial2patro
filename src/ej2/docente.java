package ej2;

public class docente extends colega{
    private String nombre;
    private int ci;

    public docente(ican ca,String nombre, String posicion, int id){
        super(ca);
        this.nombre = nombre;
        this.ci = id;
    }

    @Override
    public void enviar(String mensaje) {
        ca.enviar(mensaje, this);
    }

    @Override
    public void recibio(String mensaje) {
        System.out.println("informacion recivbida de:  "+nombre+ ", con el ci de: "+ ci + "con el mensaje: "+mensaje);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getCi() {
        return ci;
    }

    public String getNombre() {
        return nombre;
    }
}
