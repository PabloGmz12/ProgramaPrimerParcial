
import pckControladores.NodoPacienteController;
import pckModelos.ListaEnlazadaPaciente;
import pckVistas.frmIngresoPacientes;
import pckVistas.frmListaPacientes;
import pckVistas.frmMain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umg
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmMain VistaPrincipal = new frmMain();
        frmIngresoPacientes VistaIngresarPacientes = new frmIngresoPacientes(VistaPrincipal, true);
        frmListaPacientes VistaListaPacientes = new frmListaPacientes(VistaPrincipal, true);
        ListaEnlazadaPaciente NuevaLista = new ListaEnlazadaPaciente();
        
        //LEVANTAR CONTROLADOR
        NodoPacienteController nuevoControlador = new NodoPacienteController(VistaPrincipal,VistaIngresarPacientes,
        VistaListaPacientes, NuevaLista);
    }
}
