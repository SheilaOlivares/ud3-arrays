package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe: ");
        String texto = br.readLine().toUpperCase();

        String abc = "abcdefghijklmñopqrstuwxyz";

        int[] recuento = new int[abc.length()];

        contarLetras(texto, abc, recuento);

        visualizarRecuento(abc, recuento);

    }

    private static void visualizarRecuento(String abc, int[] recuento) {

        for (int i = 0; i < recuento.length; i++) {
            if (recuento[i] > 0) {
                System.out.println(abc.charAt(i) + ": " + recuento[i]);
            }
        }
    }

    private static void contarLetras(String texto, String abc, int[] recuento) {

        for (int i = 0; i < texto.length(); i++) {

            char letra = texto.charAt(i);

            for (int z = 0; z < abc.length(); z++) {

                if (abc.charAt(z) == letra) {
                    recuento[z] += 1;
                }
            }
        }
    }
