package Model;

public class Cabagna extends Hospederia{

    public boolean chimenea;

    public Cabagna(boolean chimenea) {
        this.chimenea = chimenea;
    }

    public Cabagna(DatosCliente datosCliente, int valorBaseNoche, int cantNoches, String tipoTemporada, int capacidad, boolean fumador, boolean chimenea) {
        super(datosCliente, valorBaseNoche, cantNoches, tipoTemporada, capacidad, fumador);
        this.chimenea = chimenea;
    }



    public boolean isChimenea() {
        return chimenea;
    }

    public void setChimenea(boolean chimenea) {
        this.chimenea = chimenea;
    }

    public int incrementaValorBase(){

        int incrementaValorBase = 0;
        if(this.getCapacidad()> 5){
            incrementaValorBase = this.getValorBaseNoche() * 18/100;
            return incrementaValorBase;

        }
        return incrementaValorBase;

    }

    @Override
    public int valorAdicional() {
        int adicional =0 ;

        if(this.isFumador()==true){

            adicional = Math.round(this.subtotal() * 30/100);
        }
        return adicional;
    }

    @Override
    public int valorACancelar() {

        return (this.subtotal() + incrementaValorBase()) - this.bonoDescuento() ;
    }


}
