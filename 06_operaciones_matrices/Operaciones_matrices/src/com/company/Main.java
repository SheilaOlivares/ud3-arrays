package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class Main {


    public static void main(String[] args) throws IOException {

        // Generar las matrices

        int[][] m1 = new int[4][4];
        int[][] m2 = new int[4][4];

        Random r = new Random();

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = r.nextInt(100);
                m2[i][j] = r.nextInt(100);

            }
        }

        visualizar(m1);
        visualizar(m2);

        // Menú
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char opcion;
        do {
            System.out.println("OPERACIONES DISPONIBLES");
            System.out.println("a) Suma");
            System.out.println("b) Producto por un escalar");
            System.out.println("c) Producto");
            System.out.println("d) Traspuesta");
            System.out.println("e) Salir");
            System.out.print("Opción: ");

            opcion = br.readLine().charAt(0);

            switch (opcion) {
                case 'a':
                    visualizar(sumarMatrices(m1, m2));
                    break;
                case 'b':
                    System.out.print("Escribe un número: ");
                    int n = Integer.parseInt(br.readLine());

                    visualizar(productoPorEscalar(m1, n));
                    break;
                case 'c':
                    visualizar(productoMatricial(m1, m2));
                    break;
                case 'd':
                    visualizar(traspuesta(m1));
                    break;
                case 'e':
                    break;
                default:
                    System.out.println("Error, escoge una opción válida. ");

            }

        } while (opcion != 'e');


    }

    private static int[][] traspuesta(int[][] matriz) {

        int[][] r = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                r[i][j] = matriz[j][i];

            }
        }
        return r;

    }

    private static int[][] productoMatricial(int[][] m1, int[][] m2) {

        int[][] r = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                r[i][j] = m1[i][j] * m2[i][j];

            }
        }
        return r;
    }

    private static int[][] productoPorEscalar(int[][] m1, int n) {

        int[][] r = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                r[i][j] = m1[i][j] * n;

            }
        }
        return r;
    }

    private static int[][] sumarMatrices(int[][] m1, int[][] m2) {

        int[][] r = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                r[i][j] = m1[i][j] + m2[i][j];

            }
        }
        return r;
    }

    private static void visualizar(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.format("%4d", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println();
    }
}












