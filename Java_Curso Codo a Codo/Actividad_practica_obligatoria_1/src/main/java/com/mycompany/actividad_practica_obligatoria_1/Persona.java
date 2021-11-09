
package com.mycompany.actividad_practica_obligatoria_1;


public class Persona {
    
    //Declaracion varaibles  
    private String nombre;
    private String apellido;
    private int edad;
    private String hobbie;
    private String codigo;
    private String sistema;  

    //Getter Persona
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
       return edad;
    }

    public String getHobbie() {
        return hobbie;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getSistema() {
        return sistema;
    }
    
    //Setter Persona
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
       this.edad = edad;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }     
}
