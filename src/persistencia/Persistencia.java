/*
 *
 */
package persistencia;

import java.util.ArrayList;
import modeloDatos.GestorArchivos;


public class Persistencia {

   
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> miAL = new ArrayList<>();
        miAL.add("Enzo");
        miAL.add("Vonkunoschy");
        miAL.add("987654321");
        miAL.add("51");
        GestorArchivos.guardarArray(miAL,"2019_Prueba.txt");
        ArrayList miAList = GestorArchivos.cargarArray("2019_Prueba.txt");
        for(int i=0;i < miAList.size();i++){
            System.out.println("Elemento almacenado: "+miAList.get(i));
        }
    }
    
}
