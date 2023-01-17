package aula4.idiomadosistema;

import java.util.*;

//* @author Jose Lourenço

public class IdiomaDoSistema {

    public static void main(String[] args) {
        Locale Language = Locale. getDefault();
                System.out.println(Language.getDisplayLanguage());//Mostra o idioma escrito      
                System. out. println(Language.getLanguage()); //Mostra Somente a sigla do idioma

    }
}
