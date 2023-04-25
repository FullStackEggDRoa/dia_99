/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_1;

import Servicios.servicios_Producto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        servicios_Producto sP = new servicios_Producto();
        
        int opcionMenu=0;
        do{
            System.out.println(".:: MENU TIENDA::.");
            System.out.println("1. Listar Nombre de Productos");
            System.out.println("2. Listar Nombre y Precios de Productos");
            System.out.println("3. Listar Productos con Precios entre 120 y 202");
            System.out.println("4. Buscar y Listar Portátiles de Productos");
            System.out.println("5. Listar Nombre y Precio del Producto más barato");
            System.out.println("6. Ingresar un producto");
            System.out.println("7. Ingresar un fabricante");
            System.out.println("8. Editar un Producto");
            System.out.print("Eliga una opción: ");
            opcionMenu = leer.nextInt();
            switch (opcionMenu) {
                case 1 ->{
                    try{
                        System.out.println("+-----------------------------+");
                        System.out.println("|     Nombre de Productos     |");
                        System.out.println("+-----------------------------+");
                        System.out.println(sP.listarNombreProductos().toString().replace(",", "+-----------------------------+\n"));
                        //System.out.println(sP.listarNombreProductos().toString());
                        System.out.println("+-----------------------------+");
                    }catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    }
                case 2 ->{
                    try{
                        
                        System.out.println("+-------------------------------+----------+");
                        System.out.println("|     Nombre de Productos       |  Precio  |");
                        System.out.println("+-------------------------------+----------+");
                        System.out.println(sP.listarNombrePreciosProductos().toString().replace(",", "+-----------------------------+----------+\n"));
                        System.out.println("+-------------------------------+----------+");
                    }catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    }
                case 3 ->{
                    try{
                        
                        System.out.println("+--------+-------------------------------+----------+");
                        System.out.println("| Codigo |     Nombre de Productos       |  Precio  |");
                        System.out.println("+--------+-------------------------------+----------+");
                        System.out.println(sP.listarNombreRango120_202().toString().replace(",", "+--------+-----------------------------+----------+\n"));
                        System.out.println("+--------+-------------------------------+----------+");
                    }catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    }
                default -> throw new AssertionError();
            }
            
        }while(true);
    }
    
}
