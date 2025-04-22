public class Persona {

    String nombre;
    String apellido;
    Domicilio domicilioParticular;
    Domicilio domicilioLaboral;

    public Persona(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre,  String apellido, Domicilio domicilioParticular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilioParticular = domicilioParticular;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Domicilio getDomicilioLaboral() {
        return domicilioLaboral;
    }

    public void setDomicilioLaboral(Domicilio domicilioLaboral) {
        this.domicilioLaboral = domicilioLaboral;
    }

    public Domicilio getDomicilioParticular() {
        return domicilioParticular;
    }

    public void setDomicilioParticular(Domicilio domicilioParticular) {
        this.domicilioParticular = domicilioParticular;
    }

    public void mostrarNombreApellido(){
        System.out.println(this.nombre+ " "+ this.apellido);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", domicilioParticular=" + domicilioParticular +
                '}';
    }
}
