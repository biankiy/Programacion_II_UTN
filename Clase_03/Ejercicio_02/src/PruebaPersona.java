public class PruebaPersona {

    /*1. Una persona. Vamos a modelar una persona incluyendo los atributos nombre y apellido y domicilio. Para
        cada uno de ellos agregaremos la visibilidad y el tipo de dato. Además agregaremos un método
        constructor, los setters necesarios y un metodo que muestre el nombre y el apellido. Luego probaremos
        nuestra nueva clase desde otra clase llamada PruebaPersona.*/

    public static void main(String[] args) {

        String nuevoNombre = "Bianca";
        String nuevoApellido = "Gimenez";
        String nuevoDomicilio = "Casa3939";

        Persona persona01 = new Persona();

        persona01.setNombre(nuevoNombre);
        persona01.setApellido(nuevoApellido);


        System.out.println(persona01.toString());

      //  Persona persona02 = new Persona("Karen", "Gimenez", "");
      //  System.out.println(persona02.toString());
      //  persona02.mostrarNombreApellido();
    }
}
