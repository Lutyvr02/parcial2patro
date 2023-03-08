package ej1;

public class Documento {
    private int versiondeldocu;
    private String textoensi;
    private String textoguardadoestado;

    public Documento(int versiondeldocu, String textoensi, String textoguardado) {
        this.versiondeldocu = versiondeldocu;
        this.textoensi = textoensi;
        this.textoguardadoestado = textoguardado;
    }

    public void setTextoguardadoestado(String textoguardadoestado) {
        this.textoguardadoestado = textoguardadoestado;
    }

    public void setTextoensi(String textoensi) {
        this.textoensi = textoensi;
    }

    public void setVersiondeldocu(int versiondeldocu) {
        this.versiondeldocu = versiondeldocu;
    }

    public String getTextoguardadoestado() {
        return textoguardadoestado;
    }

    public String getTextoensi() {
        return textoensi;
    }

    public int getVersiondeldocu() {
        return versiondeldocu;
    }

    public void mostinformacion(){
        System.out.println("Identificacion del documento es: "+versiondeldocu);
        System.out.println("el texto guardado es: "+textoensi);
        System.out.println("el estado de lo guardado es: "+textoguardadoestado);

    }
}
