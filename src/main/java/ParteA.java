
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nacho
 * https://github.com/jsalgua027/Pares_Nones.git
 */
public class ParteA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Activo la clase Escaner y la clase Random
        Scanner datos=new Scanner (System.in);
        Random numAleatorio= new Random();
        //Inicializo las variables
        int numeroDedosUsuario1;
        int numeroDedosUsuario2;
        int opcion;
        int n;
        int eleccion;
        boolean pares;
       
        // Uso el do while para crear programa del juego  
        do {
            System.out.println("1 Usuario1 VS Usuario2 ");
            System.out.println("2 Yo VS Maquina");
            System.out.println("3 Para terminar");

            opcion=datos.nextInt();
            

            switch (opcion) {
                case 1:
                      //Tenemos el resultado vamos a elejir pares o nones 
                    do {
                        System.out.println("1.Elije si Par");
                        System.out.println("2.Elije es Nones");
                        eleccion = datos.nextInt();

                    } while (eleccion > 2 || eleccion > 1);
                    
                    //En el case 1 Usuario1 vs Usuario2 genero bloques de do while por usuario.
                    do {
                        System.out.println("Jugador1 introduce numero de dedos ");
                        numeroDedosUsuario1 = datos.nextInt();

                    }while(numeroDedosUsuario1<=0 || numeroDedosUsuario1>=10);
                    do {
                        System.out.println("Jugador2 introduce numero de dedos ");
                        numeroDedosUsuario2 = datos.nextInt();

                    } while (numeroDedosUsuario2 <= 0 || numeroDedosUsuario2 >= 10);

                    int resultado = numeroDedosUsuario1 + numeroDedosUsuario2;
      
                    
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
