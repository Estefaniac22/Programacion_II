
package Utilidades;


public class Empleado extends Ciudadano {
private String empresa;
private int antiguedad;

public Empleado (String apellido, String nombre, long cuil, int edad, String nacionalidad, String provincia, String empresa, int antiguedad){
    super (apellido, nombre, cuil, edad, nacionalidad, provincia);
    this.empresa = empresa ;
    this.antiguedad = antiguedad ;
    
}

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }



    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

        public int getAntiguedad() {
        return antiguedad;
    }
}
