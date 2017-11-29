package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("¿Cuantos sois en clase? ");
        int cantClase = Integer.parseInt(br.readLine());
        String[] listaClase = new String[cantClase];


        System.out.println("Escribe el nombre y apellido  de tus compañeros de clase.");
        for (int i = 0; i < listaClase.length; i++) {
            System.out.print("Nombre: ");
            listaClase[i] = br.readLine();
        }


        String valor;
        do {
            System.out.print("Escribe una letra o Fin para acabar: ");
            valor = br.readLine();

            int cantidad = 0;

            System.out.println("Lista de nombres: ");

            if (!valor.equalsIgnoreCase("Fin")) {
                char letra = valor.toUpperCase().charAt(0);
                for (int i = 0; i < listaClase.length; i++) {

                    char comprobar = listaClase[i].toUpperCase().charAt(0);

                    if (letra == comprobar) {
                        System.out.println(listaClase[i]);
                        cantidad++;
                    }
                }
            }
            if (cantidad == 0) {
                System.out.println("No hay nombres con la letra que has escrito .");
            }
            System.out.println("");
        } while (!valor.equalsIgnoreCase("Fin"));

    }
}