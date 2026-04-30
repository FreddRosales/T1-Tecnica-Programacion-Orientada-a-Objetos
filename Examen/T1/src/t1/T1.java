/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t1;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class T1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        Trabajador t = new Trabajador();

        System.out.println("=== REGISTRO DE TRABAJADOR - INNOVADORES S.A. ===");

        // Captura de datos básicos
        System.out.print("Ingrese nombres: ");
        t.setNombres(teclado.nextLine());

        System.out.print("Tipo de documento (DNI/RT): ");
        t.setTipodoc(teclado.nextLine());

        System.out.print("Número de documento: ");
        t.setNumdoc(teclado.nextLine());

        System.out.print("Régimen Laboral (728/LS): ");
        t.setReglab(teclado.nextLine());

        System.out.print("Fondo de Pensión (Integra/Prima/Habitat/ONP): ");
        t.setFondpen(teclado.nextLine());

        System.out.print("¿Tiene hijos? (true/false): ");
        t.setHij(teclado.nextBoolean());

        System.out.print("Horario de trabajo (Diurno/Nocturno): ");
        t.setHortrab(teclado.nextLine());

        System.out.print("Sueldo Base: ");
        t.setSueld(teclado.nextDouble());

        // Mostrar resultados validados
        System.out.println("\nPROCESANDO INFORMACIÓN...");
        t.VerDatos();
    }
    
}
