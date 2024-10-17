
package logica;

import actores.Socio;
import java.util.ArrayList;
import java.util.List;


public class ListaSocios {
    private static List<Socio> listaSocios = new ArrayList<>();

    public static List<Socio> getListaSocios() {
        return listaSocios;
    }

    public static void setListaSocios(List<Socio> listaSocios) {
        ListaSocios.listaSocios = listaSocios;
    }
    
    public static void addSocio(Socio socio){
        listaSocios.add(socio);
    }
    
    public static void imprimirSocios(){
        for(Socio socio : listaSocios){
            System.out.println(socio.toString());
        }
    }
}
