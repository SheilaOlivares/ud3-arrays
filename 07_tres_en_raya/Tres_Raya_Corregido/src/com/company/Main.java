package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Tablero
        int[][] tablero = new int[3][3];

        // ¿A quien le toca?
        int turno = 0;

        inicializar(tablero);

        int tiradas = 0;

        do {

            visualizar(tablero);

            // Pedir las coordenadas
            System.out.print("Introduce fila : ");
            int fila = Integer.parseInt(br.readLine());
            System.out.print("Ibtroduce columna : ");
            int columna = Integer.parseInt(br.readLine());

            // Comprobar si el hueco está libre
            if (tablero[fila][columna] == 3) {
                // Libre

                tablero[fila][columna] = turno;

                if (hayGanador(tablero, turno)) {
                    System.out.println("Enhorabuena! Has ganado! ");
                } else {
                    if (turno == 1)
                        turno = 0;
                    else
                        turno = 1;
                }

                tiradas += 1;

            } else {
                // Ocupado
                System.out.println("Casilla ocupada, prueba de nuevo. ");
            }

        } while (tiradas < 9 && !hayGanador(tablero, turno));

        if (tiradas == 9) {
            System.out.println("Empate");
        }
    }

    private static boolean hayGanador(int[][] t, int turno) {

        boolean hayGanador = false;

        // Filas
        if (t[0][0] == turno && t[0][1] == turno && t[0][2] == turno) {
            hayGanador = true;
        }
        if (t[1][0] == turno && t[1][1] == turno && t[1][2] == turno) {
            hayGanador = true;
        }
        if (t[2][0] == turno && t[2][1] == turno && t[2][2] == turno) {
            hayGanador = true;
        }

        // Columnas
        if (t[0][0] == turno && t[1][0] == turno && t[2][0] == turno) {
            hayGanador = true;
        }
        if (t[0][1] == turno && t[1][1] == turno && t[2][1] == turno) {
            hayGanador = true;
        }
        if (t[0][2] == turno && t[1][2] == turno && t[2][2] == turno) {
            hayGanador = true;
        }

        // Diagonales
        if (t[0][0] == turno && t[1][1] == turno && t[2][2] == turno) {
            hayGanador = true;
        }
        if (t[0][2] == turno && t[1][1] == turno && t[2][0] == turno) {
            hayGanador = true;
        }

        return hayGanador;
    }

    public static void inicializar(int[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = 3;
            }
        }
    }

    public static void visualizar(int[][] t) {

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {

                switch (t[i][j]) {
                    case 0:
                        System.out.print(" O ");
                        break;
                    case 1:
                        System.out.print(" X ");
                        break;
                    case 3:
                        System.out.print(" . ");
                        break;
                }

            }
            System.out.println();
        }
    }
}
