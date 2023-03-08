package ej1;
import java.util.HashMap;
import java.util.Map;
public class editor {

    private final Map<Integer, Memento> estadoguar = new HashMap<>();
    private int versiondefinitiva;
    private int version;

    public void setVersion(int version) {
        this.version = version;
    }

    public Memento getVersion(String comando) {
        int ty = version;
        if (comando.toLowerCase().equals("controlz") ||  comando.toLowerCase().equals("revertir")&& ty-1 != 0){
            setVersion(version-1);
            return estadoguar.get(ty-1);
        } else if (comando.toLowerCase().equals("controly") ||  comando.toLowerCase().equals("deshacer")&& ty+1 <= versiondefinitiva) {
            setVersion(version+1);
            return estadoguar.get(ty+1);

        }else {
            System.out.println("el comando no existe en este contexto");
            return estadoguar.get(ty);
        }
    }

    public void setVersiondefinitiva(int versiondefinitiva) {
        this.versiondefinitiva = versiondefinitiva;
    }

    public int getVersiondefinitiva() {
        return versiondefinitiva;
    }

    public void guardarDocu(Integer Version, Memento mem){
        setVersion(version);
        setVersiondefinitiva(version);
        estadoguar.put(version, mem);
    }


}
