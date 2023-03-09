package ej2;

public class client {
    public static void main(String[] args) {
        chateduca cha = new chateduca();
        estudiante est1 = new estudiante(cha, "eadasdasd",312312321,true,false,false);
        estudiante est2 = new estudiante(cha, "eadasdasd",312312321,true,true,false);
        estudiante est3 = new estudiante(cha, "eadasdasd",312312321,true,true,false);
        estudiante est4 = new estudiante(cha, "eadasdasd",312312321,true,false,false);
        estudiante est5 = new estudiante(cha, "eadasdasd",312312321,true,false,true);

        admin ad1 = new admin(cha,"dasdasdsa","asdasdsad",545345);
        admin ad2 = new admin(cha,"dfdafasfas","hdfgdfhdf",5345345);
        admin ad3 = new admin(cha,"fasfasfasf","kukyukuykuy",1231231);

        docente doc1 = new docente(cha, "erqedadasd","asdasdasda",2312312);
        docente doc2 = new docente(cha, "efasdfasfas","jfghfghgfh",454325324);
        docente doc3 = new docente(cha, "bcvbcvb","cvbcvbcv",345345435);

        cha.anagente(est1 );
        cha.anagente(est2 );
        cha.anagente(est3 );
        cha.anagente(est4 );
        cha.anagente(ad2 );
        cha.anagente(ad1 );
        cha.anagente(ad3 );
        cha.anagente(doc1 );
        cha.anagente(doc2 );
        cha.anagente(doc3 );

        est1.enviar("hola docente");
        est5.enviar("hola todos");
        est2.enviar("hola admin");
        est3.enviar("hola docente y estudiantes");
        ad2.enviar("hola a todos");
    }
}
