
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author nacho https://github.com/jsalgua027/Pares_Nones.git
 */
public class ParteA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Activo la clase Escaner y la clase Random
        Scanner datos = new Scanner(System.in);
        Random numAleatorio = new Random();
        //Inicializo las variables
        int numeroDedosUsuario1;
        int numeroDedosUsuario2;
        int opcion;
        int n;
        int eleccion;
        boolean pares = false;

        // Uso el do while para crear programa del juego  
        do {
            System.out.println("1 Usuario1 VS Usuario2 ");
            System.out.println("2 Yo VS Maquina");
            System.out.println("3 Para terminar");

            opcion = datos.nextInt();

            switch (opcion) {
                case 1:
                    //Tenemos el resultado vamos a elejir pares o nones 
                    do {
                        System.out.println("1.Elegir si Par");
                        System.out.println("2.Elegir es Nones");
                        eleccion = datos.nextInt();
                        // Usamos swicht para la elección
                        switch (eleccion) {

                            case 1:
                                System.out.println("Has elegido Pares");
                                pares = true;
                                break;
                            case 2:
                                System.out.println("Has elegido Nones");
                                pares = false;
                                break;
                            default:
                                System.out.println("Indica la opción correcta");

                        }

                    } while (eleccion > 2 || eleccion > 1);

                    //En el case 1 Usuario1 vs Usuario2 genero bloques de do while por usuario.
                    do {
                        System.out.println("Jugador1 introduce numero de dedos ");
                        numeroDedosUsuario1 = datos.nextInt();

                    } while (numeroDedosUsuario1 <= 0 || numeroDedosUsuario1 >= 10);
                    do {
                        System.out.println("Jugador2 introduce numero de dedos ");
                        numeroDedosUsuario2 = datos.nextInt();

                    } while (numeroDedosUsuario2 <= 0 || numeroDedosUsuario2 >= 10);

                    int resultado = numeroDedosUsuario1 + numeroDedosUsuario2;
                    //comprobamos si el resultado es pares o nones y con obtenemos el ganador.
                    //si gana pares
                    if (resultado % 2 == 0) {
                        if (pares == true) {
                            System.out.println("Gana el  jugador 1");
                        } else {
                            System.out.println("Gana el jugador 2");
                            // si gana impares
                        }
                    } else {
                        if (pares != true) {
                            System.out.println("Gana el juegador 1");

                        } else {
                            System.out.println("Gana el jugador 2");

                        }

                    }

                    break;

                case 2:
                    //Tenemos el resultado vamos a elejir pares o nones 
                    do {
                        System.out.println("1.Elegir si Par");
                        System.out.println("2.Elegir es Nones");
                        eleccion = datos.nextInt();
                        // Usamos swicht para la elección
                        switch (eleccion) {

                            case 1:
                                System.out.println("Has elegido Pares");
                                pares = true;
                                break;
                            case 2:
                                System.out.println("Has elegido Nones");
                                pares = false;
                                break;
                            default:
                                System.out.println("Indica la opción correcta");

                        }

                    } while (eleccion > 2 || eleccion > 1);

                    //En el case  Usuario vs Maquina genero bloques de do while.
                    do {
                        System.out.println("Jugador introduce numero de dedos ");
                        numeroDedosUsuario1 = datos.nextInt();
                        //condiciono que el número sea el correcto
                    } while (numeroDedosUsuario1 <= 0 || numeroDedosUsuario1 >= 10);
                    //genero un numero aleatorio en 0 y 10 para la maquina
                    int numRadom = numAleatorio.nextInt(11);
                    System.out.println("la maquina ha elegido " + numRadom);
                    int resultadoVsMaquina = numeroDedosUsuario1 + numRadom;
                    System.out.println("Resultado Vs Maquina" + resultadoVsMaquina);
                    //comprobamos si el resultado es pares o nones y  obtenemos el ganador.
                    //si gana pares
                    if (resultadoVsMaquina % 2 == 0) {

                        if (pares == true) {
                            System.out.println("Gana el  jugador ");
                        } else {
                            System.out.println("Gana la maquina");
                            // si gana impares
                        }
                    } else {
                        if (pares != true) {
                            System.out.println("Gana el juegador ");

                        } else {
                            System.out.println("Gana la maquina");

                        }

                    }

                    break;

                case 3:

                    break;
                //por si el usuario se equivoca en el menu 
                default:
                    System.out.println("te has equivocado");

            }
        } while (opcion != 3);

    }

}
