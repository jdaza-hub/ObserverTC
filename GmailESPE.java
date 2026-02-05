/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tccobserver;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class GmailESPE {
    
    String Nombre;

    public GmailESPE(String Nombre) {
        this.Nombre = Nombre;
    }

    public GmailESPE() {
    }
    
    private ArrayList<NotificacionESPE> estudiantes = new ArrayList<>();
   
    
    public void AgregarEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    } 
    
    public void MandarMensajeGmail(String Mensaje){
        for (NotificacionESPE estudiante : estudiantes) {
            estudiante.Notificar(Mensaje);
            
        }
      
        
        
    }
    
    public void MostrarEstudiantesNotificado(){
        System.out.println("Estudiantes Notificados" + Nombre + ": ");
          for (NotificacionESPE estudiante : estudiantes) {
            System.out.println("- " + estudiante);
        }
    }
    }
    
    

/*   public void AgregarCliente(Cliente cliente){
       clientes.add(cliente);
       
    }
    public void Notificar(String Mensaje){
        for (Cliente cliente:clientes) {
            cliente.Actualizar(Mensaje);
            
        }
    
    }
     public void MostrarClienteNotificados(){
         System.out.println("Clientes notificados" + Nombre + " : ");
          for (Cliente cliente:clientes) {
              System.out.println("* " + cliente.getNombre());
            
        }
     } */
