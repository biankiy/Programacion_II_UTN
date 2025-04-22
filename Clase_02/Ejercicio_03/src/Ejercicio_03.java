import java.util.Scanner;

public class Ejercicio_03 {

    /*El cambio que hicimos funcionó perfectamente. El único problema fue que el empleado, ingresó como
        cantidad de alumnos para cargar el total de inscriptos. Pero luego comprobó que algunos de los inscriptos
        nunca rindieron examen. Entonces tuvo que “inventar” datos para que el ciclo llegara a su fin. Debemos
        modificar el programa para que el ciclo se detenga cuando el usuario lo requiera.*/

    public static void main(String[] args) {

        Scanner miTeclado = new Scanner(System.in);

        /*  definimos las variables que necesitamos  */
        double notaPrimerParcial = 0;
        double notaSegundoParcial = 0;
        double promedio = 0;
        String nombreAlumno = "";
        int cuantosAlumnos = 0;
        double sumaDePromedios = 0;

        /*  se pide que se ingresen los datos en un ciclo*/
        System.out.println("ingrese el nombre del alumno (0 para salir)");
        nombreAlumno = miTeclado.nextLine();

        while (!nombreAlumno.equals("0")) {
            cuantosAlumnos++;
            System.out.println("ingrese la nota del 1er parcial");
            notaPrimerParcial = Double.parseDouble(miTeclado.nextLine());
            System.out.println("ingrese la nota del 2do parcial");
            notaSegundoParcial = Double.parseDouble(miTeclado.nextLine());

            /*  calculamos el promedio*/
            promedio = (notaPrimerParcial + notaSegundoParcial) / 2;
            sumaDePromedios += promedio;
            /*esta inst. equivale a sumaDePromedios = sumaDePromedios + promedio*/

            if (promedio > 4) {
                if (promedio == 10) {
                    System.out.println("felicitaciones GENIOOO!!!");
                } else {
                    System.out.println("felicitaciones!!!");
                }
            } else {
                System.out.println("debe estudiar más!!");
            }
            System.out.println("el promedio de " + nombreAlumno + " es " + promedio);

            /*  terminó una iteración, permite cargar otro alumno*/
            System.out.println("ingrese el nombre del alumno (0 para salir)");
            nombreAlumno = miTeclado.nextLine();
        }

        /*  aquí terminó el ciclo*/
        double promedioGral = sumaDePromedios / cuantosAlumnos;
        System.out.println("el promedio general es " + promedioGral);

        System.out.println("gracias por usar nuestro programa!!");
        miTeclado.close();

    }


}
