/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Guillermolp
 */
public class Proyecto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Profe1[] pepe;
        int tam = 0;
        System.out.print("de que tamaño es el arreglo:");
        tam = sc.nextInt();
        pepe = new Profe1[tam];
        for (int i = 0; i < pepe.length; i++) {
            pepe[i] = new Profe1();
        }

        int o1 = 100;
        int o2 = 100;
        int o3 = 100;
        String o4 = "";
        while (o1 != 0) {
            System.out.println("------------------------------------");
            System.out.println("1) Agregar clientes");
            System.out.println("2) Mostrar clientes ");
            System.out.println("3) Buscar clientes");
            System.out.println("0) Salir");
            System.out.print("Elige una opcion:");
            o1 = sc.nextInt();

            switch (o1) {
                case 1:
                    try {
                        for (int i = 0; i < pepe.length; i++) {
                            System.out.print("Introduce el codigo: ");
                            pepe[i].setCodigoCliente(sc.nextInt());
                            System.out.print("Introduce el nombre: ");
                            pepe[i].setNombre(bf.readLine());
                            System.out.print("Introduce apellido paterno : ");
                            pepe[i].setApellidoP(bf.readLine());
                            System.out.print("Introcuce el apellido materno: ");
                            pepe[i].setApellidoM(bf.readLine());
                            System.out.print("Introduce el numero de telefono : ");
                            pepe[i].setTelfono(bf.readLine());
                            System.out.print("introduce direccion: ");
                            pepe[i].setDireccion(bf.readLine());
                            System.out.print("Introduce edad: ");
                            pepe[i].setEdad(sc.nextInt());
                        }
                    } catch (Exception e) {
                        System.out.println("no hay espacio");
                    }

                    break;
                case 2:
                    System.out.println("----Lista de productos------");
                    for (int i = 0; i < pepe.length; i++) {
                        System.out.println("codigo: " + pepe[i].getCodigoCliente());
                        System.out.println("nombre: " + pepe[i].getNombre());
                        System.out.println("Apellido paterno: " + pepe[i].getApellidoP());
                        System.out.println("Apellido Materno: " + pepe[i].getApellidoM());
                        System.out.println("Telefono: " + pepe[i].getTelfono());
                        System.out.println("Dirreccion: " + pepe[i].getDireccion());
                        System.out.println("Edad: " + pepe[i].getEdad());

                    }
                    System.out.println("------------------------------------");
                    break;
                case 3:
                    while (o3 != 0) {
                        System.out.println("----------Sub Menu------");
                        System.out.println("1) Buscar por codigo ");
                        System.out.println("2) Buscar por nombre");
                        System.out.println("0) Regresar");
                        System.out.print("Elige una opcion: ");
                        o3 = sc.nextInt();
                        switch (o3) {
                            case 1:
                                System.out.print("Cual producto quieres consultar: ");
                                o2 = sc.nextInt();
                                if (o2 >= 0 && o2 < pepe.length) {
                                    System.out.println("Codigo: " + pepe[o2].getCodigoCliente());
                                    System.out.println("nombre: " + pepe[o2].getNombre());
                                    System.out.println("Apellido paterno: " + pepe[o2].getApellidoP());
                                    System.out.println("Apellido materno: " + pepe[o2].getApellidoM());
                                    System.out.println("Telefono: " + pepe[o2].getTelfono());
                                    System.out.println("Direccion: " + pepe[o2].getDireccion());
                                    System.out.println("Edad: " + pepe[o2].getEdad());

                                } else {
                                    System.out.println("Ese producto no existe");

                                }
                                break;
                            case 2:
                                try {

                                    System.out.println("Introduce el nombre");
                                    o4 = (bf.readLine());
                                    for (int i = 0; i < pepe.length; i++) {
                                        if (o4.equals(pepe[i].getNombre())) {
                                            System.out.println("Codigo: " + pepe[i].getCodigoCliente());

                                            System.out.println("nombre: " + pepe[i].getNombre());
                                            System.out.println("Apellido paterno: " + pepe[i].getApellidoP());
                                            System.out.println("Apellido materno: " + pepe[i].getApellidoM());
                                            System.out.println("Telefono: " + pepe[i].getTelfono());
                                            System.out.println("Direccion: " + pepe[i].getDireccion());
                                            System.out.println("Edad: " + pepe[i].getEdad());
                                        }
                                    }
                                } catch (Exception e) {
                                    System.out.println("No exisate");
                                }
                                break;

                            case 0:
                                System.out.println("Gracias por usar el sub menu");

                        }
                    }
                    break;

                case 0:
                    System.out.println("GRACIAS,ADIOS");
                    break;
            }
        }
    }
}


