import java.util.Random;
import java.util.Scanner;

public class Ejercicio_04 {

    /*El casino “Nunca Pierdo” ha implementado un programa para asistir a sus jugadores con su juego. Cada
        jugador contará con un programa, que funcionará en forma personalizada. Al iniciarse registra el nombre
        del jugador y la cantidad de dinero con que jugará (mínimo $50000). El programa le permite jugar hasta
        que se cumpla alguna de las siguientes situaciones:
            - el dinero restante del jugador esté por debajo del 20% del monto inicial que trajo.
            - el dinero restante del jugador no sea suficiente para jugar a ninguno de los juegos disponibles.
            - el jugador haya ganado $5.000.000 o más.
        El jugador puede jugar muchas rondas a diferentes juegos y cada uno tiene un valor de apuesta:
            - ruleta: $10000
            - black jack: $20000
            - poker: $50000
        El programa debe preguntar a qué juego desea jugar (RUL, BJK o PKR) y luego debe mostrar el costo del
        juego elegido.

        Si el dinero le alcanza para el juego elegido hacer lo siguiente:
            - Restar el costo del juego del dinero del jugador
            - Según el resultado del juego, que puede ser 0, 1 o 2, se realizará lo siguiente: si es 2, se sumará el
                doble del valor apostado al dinero del jugador, si es 1, se sumará el valor apostado al dinero del
                jugador y si es 0, no se sumará nada al dinero del jugador.
            - Para obtener el resultado del juego, se utilizará una función que genera números aleatorios
                 (indicada por el docente).
        Si el dinero no le alcanza mostrará el mensaje “no le alcanza el dinero para este juego” y vuelve a dar a
            elegir un juego.
        Al finalizar la ronda de juegos (porque se cumplió alguna de las condiciones de fin) se muestra lo
        siguiente:
            - El dinero que le queda al jugador
            - La cantidad de veces que jugó a cada juego
            - Qué porcentaje significa esa cantidad sobre el total de juegos que jugó*/

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String nombre = " ";
        double dineroJugador;
        String juegoSeleccionado = "0";
        double ingresoDinero = 0;
        double dineroGanado = 0;
        int salir = 0;
        int contadorRuleta = 0;
        int contadorBlackJack = 0;
        int contadorPoker = 0;

        Random aleatorio = new Random(System.currentTimeMillis());



        System.out.println("Ingrese su nombre de Jugador: ");
        nombre = leer.nextLine();
        System.out.println("Ingrese la cantidad de dinero que quiere usar: ");
        dineroJugador = Double.parseDouble(leer.nextLine());
        do {

            if (dineroJugador < 50000) {
                System.out.println(" El valor minimo para jugar es de $50.000");
                System.out.println("\nDesea ingresar otro monto, o salir?");
                System.out.println("1. Salir");
                System.out.println("2. Ingresar otro Monto ");
                salir = Integer.parseInt(leer.nextLine());
                if(salir == 2){
                    System.out.println("El saldo total es: " + dineroJugador);
                    System.out.println("Ingrese cantidad de dinero: ");
                    ingresoDinero = Double.parseDouble(leer.nextLine());
                    dineroJugador += ingresoDinero;
                }

                //Hasta aca está bien
            }

            while (dineroJugador >= 50000){
                System.out.println("-------  Juegos  -------");
                System.out.println("1. Ruleta     --- $10000");
                System.out.println("2. Black Jack --- $20000");
                System.out.println("3. Poker      --- $50000");
                System.out.println("Que juego desea Jugar: ");
                juegoSeleccionado = leer.nextLine();

                switch (juegoSeleccionado) {
                    case "1":
                        if(dineroJugador >= 10000){
                            contadorRuleta++;

                            System.out.println("Ruleta -> ");
                            dineroJugador -=10000;
                            int numeroAleatorio = aleatorio.nextInt(3);

                            if(numeroAleatorio == 2){
                                dineroGanado = 10000 + (10000 * 2);
                                dineroJugador += dineroGanado;
                            }else if(numeroAleatorio == 1){
                                dineroGanado = 10000 + 10000;
                                dineroJugador += dineroGanado;
                            }
                            System.out.println("El resultado de la ruleta es: "+ dineroGanado);
                        }
                        break;
                    case "2":
                        if(dineroJugador >= 20000){
                            contadorBlackJack++;
                            System.out.println("Black Jack -> ");
                            dineroJugador -=20000;
                            int numeroAleatorio = aleatorio.nextInt(3);

                            if(numeroAleatorio == 2){
                                dineroGanado = 20000 + (20000 * 2);
                                dineroJugador += dineroGanado;
                            }else if(numeroAleatorio == 1){
                                dineroGanado = 20000 + 20000;
                                dineroJugador += dineroGanado;
                            }
                            System.out.println("El resultado de la ruleta es: "+ dineroGanado);
                        }

                        break;
                    case "3":
                        if(dineroJugador >= 50000){
                            contadorPoker++;
                            System.out.println("POKER  -> ");
                            dineroJugador -=50000;
                            int numeroAleatorio = aleatorio.nextInt(3);

                            if(numeroAleatorio == 2){
                                dineroGanado = 50000 + (50000 * 2);
                                dineroJugador += dineroGanado;
                            }else if(numeroAleatorio == 1){
                                dineroGanado = 50000 + 50000;
                                dineroJugador += dineroGanado;
                            }
                            System.out.println("El resultado de la ruleta es: "+ dineroGanado);
                        }
                        break;
                }
                if(dineroJugador < 50000){
                    System.out.println(" \n --- Ups te quedaste sin dinero ---\n");
                }
                if (dineroJugador < (dineroGanado * 0.2)) {
                    System.out.println("Te quedaste por debajo del 20% del monto inicial.");
                    salir = 1;
                } else if (dineroGanado >= 5000000) {
                    System.out.println("¡Felicidades! Has ganado $5,000,000 o más.");
                    salir = 1;
                }
            }


        } while (salir != 1);
        System.out.println("Te queda: " + dineroJugador);
        System.out.println("Jugaste Ruleta: " + contadorRuleta + " veces.");
        System.out.println("Jugaste Black Jack: " + contadorBlackJack + " veces.");
        System.out.println("Jugaste Poker: " + contadorPoker + " veces.");

    }
}
