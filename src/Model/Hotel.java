package Model;

public class Hotel extends Hospederia{

    public boolean desayuno;

    public Hotel(boolean desayuno) {
        this.desayuno = desayuno;
    }

    public Hotel(DatosCliente datosCliente, int valorBaseNoche, int cantNoches, String tipoTemporada, int capacidad, boolean fumador, boolean desayuno) {
        super(datosCliente, valorBaseNoche, cantNoches, tipoTemporada, capacidad, fumador);
        this.desayuno = desayuno;
    }

    public Hotel(int capacidad, boolean fumador, boolean desayuno) {
        super(capacidad, fumador);
        this.desayuno = desayuno;
    }

    public boolean isDesayuno() {
        return desayuno;
    }

    public void setDesayuno(boolean desayuno) {
        this.desayuno = desayuno;
    }

    @Override
    public int valorAdicional() {

        int adicional =0 ;

        if(this.isDesayuno()== true){

           adicional = Math.round(this.subtotal() * 30/100);
        }
           return adicional;
    }
    @Override
    public int valorACancelar() {

        return (this.subtotal() + this.valorAdicional()) - this.bonoDescuento() ;
    }
}
