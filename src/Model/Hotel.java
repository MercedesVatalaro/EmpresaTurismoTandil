package Model;

public class Hotel extends Hospederia{

    public String desayuno;

    public Hotel(DatosCliente datosCliente, int capacidad, String fumador, String desayuno) {
        super(capacidad, fumador);
        this.desayuno = desayuno;
    }

    public Hotel() {
    }

    public String isDesayuno() {
        return desayuno;
    }

    public void setDesayuno(String desayuno) {
        this.desayuno = desayuno;
    }

    @Override
    public int valorAdicional() {

        int adicional =0 ;

        if(this.isDesayuno().equalsIgnoreCase("si")){

           adicional = Math.round(this.subtotal() * 30/100);
        }
           return adicional;
    }
}
