/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckModelos;

/**
 *
 * @author umg
 */
public class NodoPaciente {
    String apellidos;
    String nombre;
    NodoPaciente next;

    public NodoPaciente(String apellidos, String nombre) {
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.next = null;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
