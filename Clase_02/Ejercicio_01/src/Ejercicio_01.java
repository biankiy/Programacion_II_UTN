import java.util.Scanner;

public class Ejercicio_01 {

    /* Necesitamos calcular el promedio de notas de un alumno. Para ello se ingresará el nombre del alumno,
        su nota del primer parcial y la nota del segundo parcial. El programa deberá mostrar un mensaje indicando
        el nombre del alumno y su promedio y a continuación un mensaje de felicitación (si su promedio es mayor
        a cuatro) o un mensaje con la recomendación de que debe estudiar más. */



    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String nombre;
        int primerNota;
        int segundaNota;
        double promedio;

        System.out.println("Ingrese su nombre: ");
        nombre = leer.nextLine();

        System.out.println("Ingrese su primer Nota: ");
        primerNota = Integer.parseInt(leer.nextLine());

        System.out.println("Ingrese su segunda Nota: ");
        segundaNota = Integer.parseInt(leer.nextLine());

        promedio = (double) (primerNota + segundaNota) / 2;
        System.out.println("El promedio de "+ nombre + " es: "+ promedio);

        if(promedio > 4 ){
            System.out.println("Felicidades Aprobaste");
        }else {
            System.out.println("Tenes que estudiar más");
        }
    }
}