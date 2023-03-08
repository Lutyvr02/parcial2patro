package ej2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class chateduca implements ican{
    private Map<Integer,colega> ty = new HashMap<>();
    private List<Integer> tyty = new ArrayList<>();
    int llave;

    @Override
    public void enviar(String mensaje, colega col) {
        colega ty1 = col;
        for (int gente: tyty){
            if(gente instanceof admin){
                admin adty = (admin)ty1;
                if (gente != admin)
            }
        }
    }
}
