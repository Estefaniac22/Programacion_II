
package Utilidades;


public class Ciudadano extends Persona {
    String nacionalidad;
    String provincia;
    
    
    public Ciudadano (String apellido, String nombre, long cuil, int edad, String nacionalidad, String provincia){
         super(apellido, nombre, cuil, edad);
         this.nacionalidad = nacionalidad;
         this.provincia = provincia;
        
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }


    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    
    public String getProvincia() {
        return provincia;
    }
    
    
    
    
    
}
