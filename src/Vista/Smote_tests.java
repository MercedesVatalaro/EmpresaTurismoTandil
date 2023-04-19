package Vista;

import Model.*;

class Smote_tests {

    public static void smote_test(String[] args) {

       Cabagna cabagna = new Cabagna (new DatosCliente("Maria Perez",34560100),15000, 4, "Media", 5, "no","si");

        Hotel hotel= new Hotel(new DatosCliente("Pedro Suarez",37890654), 4, "No", "Si");

        Carpa carpa= new Carpa(new DatosCliente("Juana Lopez",37567051), 6000, 3, "Alta",2  );


    }


}
