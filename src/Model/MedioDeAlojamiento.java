package Model;

public abstract class MedioDeAlojamiento {

    public int valorBaseNoche;

    public int cantNoches;

    public String tipoTemporada;


    private DatosCliente datosCliente;


    public MedioDeAlojamiento( DatosCliente datosCliente, int valorBaseNoche, int cantNoches, String tipoTemporada) {
        this.valorBaseNoche = valorBaseNoche;
        this.cantNoches = cantNoches;
        this.tipoTemporada = tipoTemporada;
         this.datosCliente = datosCliente;
    }

    public MedioDeAlojamiento() {
    }

    public int getValorBaseNoche() {
        return valorBaseNoche;
    }

    public void setValorBaseNoche(int valorBaseNoche) {
        this.valorBaseNoche = valorBaseNoche;
    }

    public int getCantNoches() {
        return cantNoches;
    }

    public void setCantNoches(int cantNoches) {
        this.cantNoches = cantNoches;
    }

    public String getTipoTemporada() {
        return tipoTemporada;
    }

    public void setTipoTemporada(String tipoTemporada) {
        this.tipoTemporada = tipoTemporada;
    }


    public DatosCliente getDatosCliente() {
        return datosCliente;
    }

    public void setDatosCliente(DatosCliente datosCliente) {
        this.datosCliente = datosCliente;
    }

    public int subtotal(){

        int subtotal = 0;

    if(this.getCantNoches() > 0) {

    subtotal= (int) ((int) this.getCantNoches() * this.getValorBaseNoche());
    }

    return subtotal;
      
    }

    public int bonoDescuento(){

        int bonoDescuento = 0;

        switch(this.getTipoTemporada().toLowerCase()){
            case "temporada baja":
                bonoDescuento = Math.round(this.subtotal()*25/100);
                break;
            case "temporada media":
                bonoDescuento = (int)Math.round(this.subtotal()*12.5/100);
                break;
            default:
                break;
        }
        return bonoDescuento;
    }
    public abstract int valorACancelar();


}

