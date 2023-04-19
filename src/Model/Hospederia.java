package Model;

public abstract class Hospederia extends MedioDeAlojamiento{

    public int capacidad;
    public String fumador;
    public Hospederia() {
    }

    public Hospederia(DatosCliente datosCliente, int valorBaseNoche, int cantNoches, String tipoTemporada, int capacidad, String fumador) {
        super(datosCliente, valorBaseNoche, cantNoches, tipoTemporada);
        this.capacidad = capacidad;
        this.fumador = fumador;
    }

    public Hospederia(int capacidad, String fumador) {
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String isFumador() {
        return fumador;
    }

    public void setFumador(String fumador) {
        this.fumador = fumador;
    }

    public abstract int valorAdicional();

    @Override
    public int valorACancelar() {
        return 0;
    }

}
