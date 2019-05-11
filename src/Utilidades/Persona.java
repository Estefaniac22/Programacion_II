package Utilidades;

public class Persona {

    //Atributos
    public String apellido;
    public String nombre;
    public long cuil;
    public int edad;

    public Persona() {

        System.out.println("Se ha instanciado persona");

    }

    public Persona(String apellido, String nombre, long cuil, int edad) {

        this.apellido = apellido;
        this.nombre = nombre;
        this.cuil = cuil;
        this.edad = edad;

    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCuil() {
        return cuil;
    }

    public void setCuil(long cuil) {
        this.cuil = cuil;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void VerDatos() {

        System.out.println(
                "Nombre: " + this.nombre
                + "Apellido: " + this.apellido
                + "Cuil: " + this.cuil
                + "edad: " + this.edad
        );
    }

}
