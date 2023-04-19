package Model;

public class DatosCliente {


    public String nombre;

    public int dni;

    public DatosCliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public DatosCliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }


}
