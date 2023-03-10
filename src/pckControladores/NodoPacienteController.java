/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckControladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pckModelos.ListaEnlazadaPaciente;
import pckVistas.frmIngresoPacientes;
import pckVistas.frmListaPacientes;
import pckVistas.frmMain;

/**
 *
 * @author umg
 */
public class NodoPacienteController implements ActionListener{
    
    //LEVANTAR EL FORMULARIO PRINCIPAL
    frmMain VistaPrincipal;
    frmIngresoPacientes VistaIngresarPacientes;
    frmListaPacientes VistaListaPacientes;
    ListaEnlazadaPaciente ListaPacientes;

    public NodoPacienteController(frmMain VistaPrincipal, frmIngresoPacientes VistaIngresarPacientes, frmListaPacientes VistaListaPacientes, ListaEnlazadaPaciente ListaPacientes) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaIngresarPacientes = VistaIngresarPacientes;
        this.VistaListaPacientes = VistaListaPacientes;
        this.ListaPacientes = ListaPacientes;
        
        //PONER A LA ESCUCHA LOS BOTONES
        this.VistaPrincipal.btnAgregarPacientes.addActionListener(this);
        this.VistaPrincipal.btnListaPacientes.addActionListener(this);
        
        //LEVANTAR LA VISTA PRINCIPAL
        this.VistaPrincipal.setExtendedState(frmMain.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.VistaPrincipal.btnAgregarPacientes){
            //ABRIR LA VISTA INGRESO DE PACIENTES
            //PONER A LA ESCUCHA LOS BOTONES DE LA VISTA INGRESO DE PACIENTES
            this.VistaIngresarPacientes.btnIngresarPaciente.addActionListener(this);
            //LEVANTAR UNO DE LOS FORMULARIOS SECUNDARIOS
            this.VistaIngresarPacientes.setLocationRelativeTo(null);
            this.VistaIngresarPacientes.setVisible(true);
        }
        if(e.getSource() == this.VistaPrincipal.btnListaPacientes){
            //ABRIR LA VISTA INGRESO DE PACIENTES
            //LEVANTAR UNO DE LOS FORMULARIOS SECUNDARIOS
            this.VistaListaPacientes.setLocationRelativeTo(null);
            this.VistaListaPacientes.setVisible(true);
        }
        if(e.getSource()== this.VistaIngresarPacientes.btnIngresarPaciente){
            this.ListaPacientes.EncolarPacientes(this.VistaIngresarPacientes.txtApellidos.getText(),
                    this.VistaIngresarPacientes.txtNombre.getText());
            this.VistaListaPacientes.txtListaPacientes.setText(this.ListaPacientes.ListarPaciente());
        }
    }
    
}
