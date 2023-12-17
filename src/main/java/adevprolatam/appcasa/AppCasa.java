/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package adevprolatam.appcasa;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class AppCasa {

    public static void main(String[] args) {
        int n=0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Casa> createHome = new ArrayList<>();

        System.out.println("# Casa");
        n = scanner.nextInt();
        for(int i=0; i<n ;i++){
            //#CASAS
            System.out.println("=========================");
            System.out.printf("Casa %d%n", (i + 1));
            System.out.println("Dirección de la casa:");
            String direccion = scanner.next();
            Casa casa = new Casa(direccion);
            //#HABITANTES
            System.out.println("Número de habitantes:");
            int numHabitantes = scanner.nextInt();
            for (int j = 0; j < numHabitantes; j++) {
                System.out.printf("PERSONA %d:\n", (j + 1));
                System.out.println("Nombre:");
                String name = scanner.next();
                System.out.println("Edad:");
                int edad = scanner.nextInt();
                Persona persona = new Persona(name, edad);
                casa.agregarHabitante(persona);
            }
            createHome.add(casa);
        }
        
        //IMPRIMIR LA LISTA CON DETALLES
         System.out.println("=========================");
         System.out.println("Información de las casas:");
         for (Casa casa : createHome) {
            System.out.println("====");
            System.out.println("Dirección: " + casa.getDireccion());
            System.out.println("Habitantes:");
            for (Persona habitante : casa.getHabitantes()) {
                System.out.println("- " + habitante.getNombre() + " " +habitante.getEdad()+ "  años");
            }
        }
    }
}
