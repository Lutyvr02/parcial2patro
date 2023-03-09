package ej2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class chateduca implements ican {
    private Map<Integer, colega> chatdegente = new HashMap<>();
    private List<Integer> listadeid = new ArrayList<>();
    int llave;

    @Override
    public void enviar(String mensaje, colega col) {
        colega origendelenvio = col;
        for (int gente : listadeid) {
            if (origendelenvio instanceof admin) {
                admin adminis = (admin) origendelenvio;
                if (gente != adminis.getId()) {
                    chatdegente.get(gente).recibio(mensaje);
                }
            } else if (origendelenvio instanceof docente && (chatdegente.get(gente)
                    instanceof docente) || chatdegente.get(gente) instanceof estudiante) {
                docente doc = (docente) origendelenvio;
                if (gente != doc.getCi()) {
                    chatdegente.get(gente).recibio(mensaje);
                }
            } else if (origendelenvio instanceof estudiante && (chatdegente.get(gente)
                    instanceof docente) || chatdegente.get(gente) instanceof admin) {
                estudiante estu = (estudiante) origendelenvio;
                if (gente != estu.getMatri()) {
                    chatdegente.get(gente).recibio(mensaje);
                } else if (gente != estu.getMatri() && estu.isEnviartodos()) {
                    chatdegente.get(gente).recibio(mensaje);

                } else if (gente != estu.getMatri() && estu.isEnviaraladmin() && chatdegente.get(gente) instanceof admin) {
                    chatdegente.get(gente).recibio(mensaje);

                } else if (gente != estu.getMatri()&& estu.isEnviaralprofe()&&chatdegente.get(gente) instanceof docente){
                    chatdegente.get(gente).recibio(mensaje);
                }
            }
        }
    }

        public void anagente (colega anadirgente){
            if (anadirgente instanceof estudiante) {
                estudiante est = (estudiante) anadirgente;
                llave = est.getMatri();
                listadeid.add(llave);
                anadiramapa(llave, anadirgente);
            } else if (anadirgente instanceof docente) {
                docente doc = (docente) anadirgente;
                llave = doc.getCi();
                listadeid.add(llave);
                anadiramapa(llave, anadirgente);
            }
            if (anadirgente instanceof admin) {
                admin ad = (admin) anadirgente;
                llave = ad.getId();
                listadeid.add(llave);
                anadiramapa(llave, anadirgente);

            }
        }

        public void anadiramapa ( int idperso, colega persona){
            chatdegente.put(idperso, persona);
        }

}

