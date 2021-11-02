
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nacho
 */
public class ParteA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        Random numAleatorio= new Random();
        
        int dedosUsuario1;
        int dedosusuario2;
        int opcion;
        
        do {
            System.out.println("1 Usuario1 VS Usuario2 ");
            System.out.println("2 Yo VS Maquina");
            System.out.println("3 Para terminar");

            opcion=datos.nextInt();
            

            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                
                case 3:
                    
                    break;
               
                default:
                    System.out.println("te has equivocado");

            }
        } while (opcion != 3);
         
    }
    
}
