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
                            String chimenea;


                            do { // itera siempre que la condición de true
                                System.out.println("Favor ingrese opción de chimenea: Si/No");
                                chimenea = Leer.dato();

                            } while (chimenea.compareToIgnoreCase("Si") != 0 && //true
                                    chimenea.compareToIgnoreCase("No") != 0); //false  ---false


                            empresa.ingresarClientesCabagna(
                                    new Cabagna(new DatosCliente("Juana Diaz", 56473898), 15000, 4, "Alta", 6, "Si", "No"));


                            System.out.println("Se agrega cliente con exito a Cabagna");


                        } else if (respuesta == 2) {
                            //Hotel
                            String fumador;
                            String desayuno;

                            do { // itera siempre que la condición de true
                                System.out.println("Favor ingrese opción de fumador: Si/No");
                                fumador = Leer.dato();

                            } while (fumador.compareToIgnoreCase("Si") != 0 && //true
                                    fumador.compareToIgnoreCase("No") != 0); //false  ---false System.out.println("Favor ingrese opción de fumador: Si/No");
                            fumador = Leer.dato();

                            do { // itera siempre que la condición de true
                                System.out.println("Favor ingrese opción de desayuno: Si/No");
                                desayuno = Leer.dato();

                            } while (desayuno.compareToIgnoreCase("Si") != 0 && //true
                                    desayuno.compareToIgnoreCase("No") != 0); //false  ---false System.out.println("Favor ingrese opción de fumador: Si/No");
                            desayuno = Leer.dato();

                            empresa.ingresarClientesHotel(new Hotel(new DatosCliente("Martin Fernandez", 34678905), 4, "Si", "No"));
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
