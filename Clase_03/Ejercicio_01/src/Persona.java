public class Persona {

    String nombre;
    String apellido;
    String domicilio;

    public Persona(){

    }

    public Persona(String nombre, String apellido, String domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", domicilio='" + domicilio + '\'' +
                '}';
    }

    public void mostrarNombreApellido(){
        System.out.println(this.nombre+ " "+ this.apellido);
    }
}
