public class Domicilio {

    private String calle;
    private int numero;
    private int piso;
    private String depto;
    private String ciudad;
    private String provincia;

    public Domicilio() {
    }

    public Domicilio(String calle, String provincia, String ciudad, String depto, int piso, int numero) {
        this.calle = calle;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.depto = depto;
        this.piso = piso;
        this.numero = numero;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }
}
