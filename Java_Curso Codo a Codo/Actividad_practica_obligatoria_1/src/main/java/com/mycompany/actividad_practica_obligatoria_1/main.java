
package com.mycompany.actividad_practica_obligatoria_1;

import java.util.Scanner;

public class main {
   
    public static void main (String[] args){
   //Crear oobjeto para tomar datos por teclado
    Scanner input = new Scanner (System.in); 
   //Crear objeto Persona
    Persona p1 = new Persona();
        // Ingreso de datos
        System.out.println("Ingrese Nombre");
        p1.setNombre(input.nextLine());
        System.out.println("Ingrese apellido");
        p1.setApellido(input.nextLine());
        System.out.println("Ingrese edad");
        p1.setEdad(input.nextInt());        
       input.nextLine();
        System.out.println("Ingrese hobbie");
        p1.setHobbie(input.nextLine());
        System.out.println("Ingrese editor de codigo preferido");
        p1.setCodigo(input.nextLine());
        System.out.println("Ingrese sistema operativo que utiliza");
        p1.setSistema(input.nextLine());        
        
        //Mostrar datos
        System.out.println("\nNombre: " + p1.getNombre());
        System.out.println("Apellido: " + p1.getApellido() );
        System.out.println("Edad: " + p1.getEdad());
        System.out.println("Hobbie: " + p1.getHobbie());
        System.out.println("Editor de Codigo: " + p1.getCodigo());
        System.out.println("Sistema operativo: " + p1.getSistema());
    }
    
}
