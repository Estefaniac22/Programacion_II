package MVC;

import Utilidades.Persona;

import java.util.Scanner;

public class VistaIngreso {

     Scanner scanner = new Scanner(System.in);
    

    public Persona cargarDatos() { //GETTER

        System.out.println("Ingrese los datos de las personas: ");
        System.out.println("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Cuil: ");
        long cuil = scanner.nextLong();
        System.out.println("Edad: ");
        int edad = scanner.nextInt();
        Persona miP = new Persona (apellido, nombre, cuil, edad);
     //   return new Persona(apellido, nombre, cuil, edad);
        return miP;
    }

    public void mostrarPersona(Persona persona) { //SETTER
        System.out.println("Datos de la persona ingresada:");
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("CUil: " + persona.getCuil());
        System.out.println("Edad: " + persona.getEdad());

    }
}