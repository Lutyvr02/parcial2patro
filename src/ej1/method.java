package ej1;

public class method {
    private Documento doc;
    public method(){}

    public void setDoc(Documento doc) {
        System.out.println("estado del documento:");
        doc.mostinformacion();
        this.doc=doc;
    }
    public Memento crearMem() {
        System.out.println("creando el estado:");
        doc.mostinformacion();
        return new Memento(this.doc);
    }

    public void restaurarDelMem(Memento mem){
        this.doc = mem.getEstado();
        System.out.println("restaurando el estado:");
        this.doc.mostinformacion();
    }
}
