package Model;

public class Cabagna extends Hospederia{

    public String chimenea;

    public Cabagna(String chimenea) {
        this.chimenea = chimenea;
    }

    public Cabagna(DatosCliente datosCliente, int valorBaseNoche, int cantNoches, String tipoTemporada, int capacidad, String fumador, String chimenea) {
        super(datosCliente, valorBaseNoche, cantNoches, tipoTemporada, capacidad, fumador);
        this.chimenea = chimenea;
    }



    public String isChimenea() {
        return chimenea;
    }

    public void setChimenea(String chimenea) {
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

        if(this.isFumador().equalsIgnoreCase("si")){

            adicional = Math.round(this.subtotal() * 30/100);
        }
        return adicional;
    }

    @Override
    public int valorACancelar() {

        return (this.subtotal() + incrementaValorBase()) - this.bonoDescuento() ;
    }


}
