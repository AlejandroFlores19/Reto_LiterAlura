package com.tunombre.literalura.principal;

import java.util.Scanner;

public class Principal {

    Scanner teclado = new Scanner(System.in);

    public void muestraMenu() {

        int opcion = -1;

        while(opcion != 0){

            System.out.println("""
            1 - Buscar libro por título
            2 - Listar libros registrados
            3 - Listar autores registrados
            4 - Listar autores vivos en determinado año
            5 - Listar libros por idioma
            0 - Salir
            """);

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Buscar libro...");
                    break;

                case 2:
                    System.out.println("Listar libros...");
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }
        }
    }
}