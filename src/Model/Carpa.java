package Model;

public class Carpa extends MedioDeAlojamiento{

    public int cantPersonas;

    public Carpa( DatosCliente datosCliente, int valorBaseNoche, int cantNoches, String tipoTemporada, int cantPersonas) {
        super(datosCliente, valorBaseNoche, cantNoches, tipoTemporada);
        this.cantPersonas = cantPersonas;
    }

    public Carpa() {

    }


    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    @Override
    public int valorACancelar() {

        return this.subtotal() - bonoDescuento();
    }
}
