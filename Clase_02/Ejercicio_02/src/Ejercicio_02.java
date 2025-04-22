import java.util.Scanner;

public class Ejercicio_02 {

    /*Nuestro primer programa fue exitoso, entonces ahora un empleado de la administración de la facu nos
    pidió usarlo para calcular los promedios de los alumnos de un curso. Modificaremos el código para que
    el usuario pueda ingresar la cantidad de alumnos a procesar y así se repita el proceso para cada uno de
    ellos. Además, al finalizar el ciclo de carga, se mostrará por pantalla el promedio general del curso y cuál
    fue el alumno con el mejor promedio.
    */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String nombre;
        int primerNota;
        int segundaNota;
        double promedio;
        int cantidadAlumnos = 0;
        double acumuladorDePromedios = 0;

        String mejorAlumno = "";
        double mejorPromedio = 0;

        System.out.println("Ingrese la cantidad de Alumnos: ");
        cantidadAlumnos = Integer.parseInt(leer.nextLine());

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Ingrese su nombre: ");
            nombre = leer.nextLine();

            System.out.println("Ingrese su primer Nota: ");
            primerNota = Integer.parseInt(leer.nextLine());

            System.out.println("Ingrese su segunda Nota: ");
            segundaNota = Integer.parseInt(leer.nextLine());


            promedio = (double) (primerNota + segundaNota) / 2;
            System.out.println("El promedio de " + nombre + " es: " + promedio);

            if (promedio > 4) {
                System.out.println("Felicidades Aprobaste");
            } else {
                System.out.println("Tenes que estudiar más");
            }

            acumuladorDePromedios += promedio;

            if (promedio > mejorPromedio) {
                mejorPromedio = promedio;
                mejorAlumno = nombre;
            }

        }

        System.out.println("El promedio general del curso es: " + acumuladorDePromedios / cantidadAlumnos);
        System.out.println("El alumno con mayor promedio es: " + mejorAlumno + " con un promedio de: " + mejorPromedio);

    }
}
