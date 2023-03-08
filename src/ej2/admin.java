package ej2;

public class admin extends colega{
    private String nombre;
    private int id;
    private String posicion;

    public admin(ican ca,String nombre, String posicion, int id){
        super(ca);
        this.nombre = nombre;
        this.posicion = posicion;
        this.id = id;
    }

    @Override
    public void enviar(String mensaje) {
        ca.enviar(mensaje, this);
    }

    @Override
    public void recibio(String mensaje) {
        System.out.println("informacion recivbida de: "+ posicion+": "+nombre+ ", id: "+id+ "con el mensaje: "+mensaje);
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}
