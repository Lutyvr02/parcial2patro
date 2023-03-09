package ej1;

public class client {
    public static void main(String[] args) {
        editor ed = new editor();
        method comando = new method();

        Documento doc;
        //1
        String txtaguardar = "Bunenas tardes";
        doc = new Documento(1, "guardado", txtaguardar);
        Memento mem = new Memento(doc);
        comando.setDoc(doc);
        ed.guardarDocu(1,comando.crearMem());

         //2
         txtaguardar = "bunasssssasaaa";
         doc = new Documento(2,"guardado",txtaguardar);
         comando.setDoc(doc);
         ed.guardarDocu(2,comando.crearMem());

        //3
        txtaguardar = "123123123213213";
        doc = new Documento(3,"guardado",txtaguardar);
        comando.setDoc(doc);
        ed.guardarDocu(3,comando.crearMem());

        //4
        txtaguardar = "asdhgsgdgfgsgsdg";
        doc = new Documento(4,"guardado",txtaguardar);
        comando.setDoc(doc);
        ed.guardarDocu(4,comando.crearMem());

        //prueba controlz
        System.out.println("revertir");
        comando.restaurarDelMem(ed.getVersion("controlz"));
        System.out.println("se uso Ctrl+Z");
        //prueba control v
        System.out.println("deshacer");
        comando.restaurarDelMem(ed.getVersion("controly"));
        System.out.println("se uso Ctrl+Y");
    }
}
