package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        double[] tempDia = new double[24];

        System.out.println("Escribe las temperaturas que ha habido a lo largo del dia: ");

        for (int i = 0; i < tempDia.length; i++) {
            System.out.print("Temperatura hora " + (i + 1) + ": ");
            tempDia[i] = Double.parseDouble(br.readLine());
        }


        double maximo = Double.MIN_VALUE;
        double minimo = Double.MAX_VALUE;
        double media = 0;

        for (int i = 0; i < tempDia.length; i++) {
            if (tempDia[i] > maximo) {
                maximo = tempDia[i];
            }
            if (tempDia[i] < minimo) {
                minimo = tempDia[i];
            }
            media = media + tempDia[i];
        }


        System.out.println("");
        System.out.println("La gráfica es: ");
        System.out.println("");


        int horas = 0;
        for (int i = 0; i < tempDia.length; i++) {
            int asteriscos = 0;
            horas++;
            System.out.print(horas + ": ");
            do {
                asteriscos++;
                System.out.print("*");
            } while (asteriscos < tempDia[i]);
            System.out.print(" " + tempDia[i]);
            if (tempDia[i] == maximo) {
                System.out.print(" --> MAX");
            } else if (tempDia[i] == minimo) {
                System.out.print(" --> MIN");
            }
            System.out.println("");
        }
        System.out.println("La media es : " + media);
    }
}
