import java.util.Random;

public class random {

    public static void main(String[] args) {



        Random aleatorio = new Random(System.currentTimeMillis());
        // Producir nuevo int aleatorio entre 0 y 99
        int numeroAleatorio = aleatorio.nextInt(3);


        System.out.println(numeroAleatorio);
    }
}
