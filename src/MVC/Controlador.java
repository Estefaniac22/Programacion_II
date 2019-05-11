
package MVC;

import Utilidades.Persona;
import java.util.ArrayList;
import modeloDatos.GestorArchivos;


public class Controlador { 
    
    public static void controlador(){
        
     VistaIngreso miVista1 = new VistaIngreso();
     
     ArrayList <String> Arraypersona = new ArrayList <>();
     Persona pp = miVista1.cargarDatos();

     Arraypersona.add(pp.getNombre());
     Arraypersona.add(pp.getApellido());
     Arraypersona.add(String.valueOf(pp.getCuil()));
     Arraypersona.add(String.valueOf(pp.getEdad()));
     GestorArchivos.guardarArray(Arraypersona,"2019_Prueba.txt");
     ArrayList miAList = GestorArchivos.cargarArray("2019_Prueba.txt");
     
      for(int i=0;i < miAList.size();i++){
            System.out.println("Elemento almacenado: "+miAList.get(i));
        }
     
   //  miVista1.mostrarPersona(persona);
           
      
        
    
    }
  
    
    public static void main(String[] args) {
        
        controlador ();
       
    }

      
    
    
    
}
