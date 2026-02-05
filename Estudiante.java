/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tccobserver;

/**
 *
 * @author user
 */
public class Estudiante implements NotificacionESPE{

    private String Nombre;

    public Estudiante() {
    }

    public Estudiante(String Nombre) {
        this.Nombre = Nombre;
    }

   
    
    
    
    @Override
    public void Notificar(String Mensaje) {
        System.out.println("Se ha notificado al Estudiante: " + Nombre + "New Mensaje " + Mensaje);
    }
    
    
}
