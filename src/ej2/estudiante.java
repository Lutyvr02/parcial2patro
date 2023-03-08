package ej2;

public class estudiante extends colega{

    public estudiante(ican ca,String nombre, int matri, boolean enviaralprofe, boolean enviaraladmin, boolean enviartodos){
        super(ca);
        this.nombre = nombre;
        this.matri = matri;
        this.enviaralprofe = enviaralprofe;
        this.enviaraladmin = enviaraladmin;
        this.enviartodos = enviartodos;
    }
    private String nombre;
    private int matri;
    private boolean enviaralprofe;
    private boolean enviaraladmin;
    private boolean enviartodos;

    @Override
    public void enviar(String mensaje) {
        ca.enviar(mensaje, this);
    }

    @Override
    public void recibio(String mensaje) {
        System.out.println("informacion recivbida de:  "+nombre+ ", con la matricula de: "+ matri + "con el mensaje: "+mensaje);
    }

    public boolean isEnviartodos() {
        return enviartodos;
    }

    public void setEnviartodos(boolean enviartodos) {
        this.enviartodos = enviartodos;
    }

    public boolean isEnviaraladmin() {
        return enviaraladmin;
    }

    public void setEnviaraladmin(boolean enviaraladmin) {
        this.enviaraladmin = enviaraladmin;
    }

    public boolean isEnviaralprofe() {
        return enviaralprofe;
    }

    public void setEnviaralprofe(boolean enviaralprofe) {
        this.enviaralprofe = enviaralprofe;
    }

    public int getMatri() {
        return matri;
    }

    public void setMatri(int matri) {
        this.matri = matri;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
