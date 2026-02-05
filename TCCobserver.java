/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tccobserver;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class TCCobserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        GmailESPE gmail = null;

        do {
            System.out.println("\n===== GMAIL ESPE =====");
            System.out.println("1. Crear Gmail");
            System.out.println("2. Agregar Estudiante");
            System.out.println("3. Enviar Mensaje");
            System.out.println("4. Mostrar Estudiantes Notificados");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            op = sc.nextInt();
            sc.nextLine(); 

            switch (op) {
                case 1:
                    System.out.print("Ingrese nombre del Gmail: ");
                    String nombreGmail = sc.nextLine();
                    gmail = new GmailESPE(nombreGmail);
                    System.out.println("Gmail creado correctamente.");
                    break;

                case 2:
                    if (gmail == null) {
                        System.out.println("Primero debe crear el Gmail.");
                        break;
                    }
                    System.out.print("Ingrese nombre del estudiante: ");
                    String nombreEst = sc.nextLine();
                    gmail.AgregarEstudiante(new Estudiante(nombreEst));
                    System.out.println("Estudiante agregado.");
                    break;

                case 3:
                    if (gmail == null) {
                        System.out.println("Primero debe crear el Gmail.");
                        break;
                    }
                    System.out.print("Ingrese el mensaje: ");
                    String mensaje = sc.nextLine();
                    gmail.MandarMensajeGmail(mensaje);
                    break;

                case 4:
                    if (gmail == null) {
                        System.out.println("Primero debe crear el Gmail.");
                        break;
                    }
                    gmail.MostrarEstudiantesNotificado();
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (op != 5);

        sc.close();
    }
    }
    
