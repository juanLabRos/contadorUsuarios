/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadorusuarios;
import dominio.usuario;
/**
 *
 * @author Juan Labandeira
 */
public class ContadorUsuarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	System.out.println("Bienvenido a la aplicación de usuarios");
	
	//array de objetos
	usuario array[] = new usuario [3];
	array[0] = new usuario("Juan", "Ros", "juanito", 666556445);
	array[1] = new usuario("Alonso", "Ruiz", "alonsito", 645324531);
	array[2] = new usuario("Santi", "Gómez", "santiaguito", 653321898);
	
	//bucle for para recorrer y visualizar el array
	
	for(int i=0; i<array.length;i++){
	    System.out.println(" "+array[i]);
	}
	
    }
    
}
