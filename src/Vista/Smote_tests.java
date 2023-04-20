package Vista;

import Model.*;

class Smote_tests {

    public static void smote_test(String[] args) {

       Cabagna cabagna = new Cabagna (new DatosCliente("Maria Perez",34560100),15000, 4, "Media", 5, true, true);

        Hotel hotel= new Hotel(new DatosCliente("Pedro Suarez",37890654), 20000, 4, "Alta", 6, true, false);

        Carpa carpa= new Carpa(new DatosCliente("Juana Lopez",37567051), 6000, 3, "Alta",2  );


    }


}
