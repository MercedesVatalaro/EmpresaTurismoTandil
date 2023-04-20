package Vista;

import Controlador.EmpresaTurismo;
import Model.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Aplicacion {

    public static void main(String[] args) {


        EmpresaTurismo empresa = new EmpresaTurismo(new ArrayList<>());
        int dni;

        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    dni = pedirDni(); //solicito el dni del cliente


                    if (empresa.buscarAlojamiento(dni) == -1) {
                        //no existe


                        System.out.println("Favor ingrese Nombre y Apellido");

                        String nombre = Leer.dato();

                        System.out.println("Ingrese el valor base noche");

                        int valorBaseNoche = Leer.datoInt();

                        System.out.println("Ingrese la cantidad de noches");

                        int cantNoches = Leer.datoInt();

                        System.out.println("El cliente ingresado es: " + nombre + "por la cantidad de: " + cantNoches + " noches. Con valor de: " + valorBaseNoche + "la noche.");
                        String tipoTemporada;
                        do {
                            System.out.println("¿Favor ingrese tipo de temporada (Alta, Media o Baja) ?");
                            tipoTemporada = Leer.dato();
                        } while (tipoTemporada.compareToIgnoreCase("Alta") != 0 &&
                                tipoTemporada.compareToIgnoreCase("Media") != 0 &&
                                tipoTemporada.compareToIgnoreCase("Baja") != 0);


                        int respuesta;
                        do {
                            System.out.println("El alojamiento es:   1) Cabagna     2)Hotel     3)Carpa");
                            System.out.println("Favor ingrese opción para continuar...");
                            respuesta = Leer.datoInt(); //2
                        } while (respuesta < 1 || respuesta > 3);
                        //false       ||  false   ---- false /se sale


                        if (respuesta == 1) {
                            //cabagna
                            boolean chimenea;
                            int deseaChimenea=0;

                                do{
                                System.out.println("Favor ingrese opción de chimenea: 1) Si 2) No");
                                deseaChimenea = Leer.datoInt();
                                switch (deseaChimenea){
                                    case 1:
                                        chimenea=true;

                                    case 2:
                                        chimenea=false;
                                        break;

                                }}

                                while(deseaChimenea< 1|| deseaChimenea>2);


                            empresa.ingresarClientesCabagna(
                                    new Cabagna(new DatosCliente("Juana Diaz", 56473898), 15000, 4, "Alta", 6, true, false));


                            System.out.println("Se agrega cliente con exito a Cabagna");


                        } else if (respuesta == 2) {
                            //Hotel
                            boolean fumador=false;
                            int opcionFumador=0;

                                do{
                                System.out.println("Favor ingrese opción de fumador: 1) Si, 2) No");
                                opcionFumador = Leer.datoInt();
                            switch (opcionFumador) {
                                case 1:
                                    fumador = true;
                                    break;
                                case 2:
                                    fumador = false;
                                    break;
                            }
                        } while (opcionFumador < 0 || opcionFumador > 2);


                                int deseaDesayuno;
                                boolean desayuno;
                                do {
                                    System.out.println("Favor ingrese opción de desayuno: 1) Si, 2)No");
                                    deseaDesayuno = Leer.datoInt();
                                switch (deseaDesayuno){
                                    case 1:
                                        desayuno=true;

                                    case 2:
                                        desayuno=false;

                                }
                                }while (deseaDesayuno < 0 || deseaDesayuno > 2);


                            empresa.ingresarClientesHotel(new Hotel(new DatosCliente("Martin Fernandez", 34678905), 20000, 4, "Alta",6, true, false));
                            System.out.println("Se agrega cliente a Hotel con exito");


                        } else {
                            //Carpa
                            System.out.println("Favor ingrese cantidad de personas");
                            int cantPersonas = Leer.datoInt();

                            empresa.ingresarClientesCarpa(
                                    new Carpa(
                                            new DatosCliente("Martina Villar", 34567890), 15000, 4, "Alta", 2
                                    ));


                            System.out.println("Se agrega cliente con exito al alojamiento Carpa por la cantidad de personas: " + cantPersonas + " personas");
                        }

                    } else {
                        System.out.println("El cliente con el DNI:" + dni + "ya esta registrado");
                    }


                    break;

                case 2:
                    if (empresa.getEmpresa().size() == 0) {
                        System.out.println("No hay registrados clientes en ningún alojamiento");
                    } else {
                        System.out.println(empresa.mostrarAlojamientos());
                    }
                    break;
                case 3:
                    if (empresa.getEmpresa().size() == 0) {
                        System.out.println("No hay registrados clientes en ningún alojamiento");
                    } else {

                        dni = pedirDni();
                        System.out.println(empresa.datosDelCliente(dni));
                    }
                    break;
                case 4:
                    if (empresa.getEmpresa().size() == 0) {
                        System.out.println("No hay registrados clientes en ningún alojamiento");

                    } else {


                        System.out.println("El Hotel tiene un total adicional de: $" + empresa.totalAdicional());
                    }
                    break;
                case 5:
                    if (empresa.getEmpresa().size() == 0) {
                        System.out.println("No hay registrados clientes en ningún alojamiento");
                    } else {


                        System.out.println("El total del bono descuento es de de: $" + empresa.totalDescuentos());
                    }
                    break;
                case 6:
                    if (empresa.getEmpresa().size() == 0) {
                        System.out.println("No hay registrados clientes en ningún alojamiento");
                    } else {


                        System.out.println(empresa.cantidadMediosDeAlojamiento());
                    }
                    break;
                case 7:
                    if (empresa.getEmpresa().size() == 0) {
                        System.out.println("No hay registrados clientes en ningún alojamiento");
                    } else {

                        dni = pedirDni();
                        System.out.println(empresa.valorACancelar(dni));
                    }
                    break;
                case 8:
                    if (empresa.getEmpresa().size() == 0) {
                        System.out.println("No hay registrados clientes en ningún alojamiento");
                    } else {

                        dni = pedirDni();
                        System.out.println(empresa.incrementoValorBase(dni));
                    }
                    break;
            }

        }
        while (opcion != 9);

    }

        public static int menu () {

            System.out.println("1.\tIngresar Medio de Alojamiento");
            System.out.println("2.\tMostrar Medios de Alojamiento");
            System.out.println("3.\tDatos del cliente");
            System.out.println("4.\tTotal Adicional");
            System.out.println("5.\tTotal Bono Descuento");
            System.out.println("6.\tCantidad Medios de Alojamiento");
            System.out.println("7.\tValor a cancelar por el cliente");
            System.out.println("8.\tAplicar incremento del valor base");
            System.out.println("9.\tSalir");
            System.out.println("10.\tFavor ingrese opción para continuar...");

            return Leer.datoInt();

        }

        public static int pedirDni () {
            System.out.println("Favor ingrese DNI");
            return Leer.datoInt();

        }


    }
