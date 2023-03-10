/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckModelos;

import javax.swing.JOptionPane;

/**
 *
 * @author umg
 */
public class ListaEnlazadaPaciente {
    NodoPaciente cola;
    NodoPaciente cabeza;
    NodoPaciente auxiliar;
    String cadena = "";
    
public void EncolarPacientes(){
    
}

public void EncolarPacientes(String apellidos, String nombre){
    NodoPaciente nuevoNodo = new NodoPaciente(apellidos, nombre);
    
    if(cola == null){
        cabeza = nuevoNodo;
        cola = nuevoNodo;
    }
    else{
        cola.next = nuevoNodo;
        cola = nuevoNodo;
    }
    JOptionPane.showMessageDialog(null, "PACIENTE AGREGADO A LA LISTA!");
}

public String ListarPaciente(){
    auxiliar = cabeza;
    cadena = "";
    while(auxiliar != null){
        cadena = cadena +auxiliar.getApellidos()+" , "+ auxiliar.getNombre()+"\n";
        auxiliar = auxiliar.next;
    }
    return cadena;
}
}
