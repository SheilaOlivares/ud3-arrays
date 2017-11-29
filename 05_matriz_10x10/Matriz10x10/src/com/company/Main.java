package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] matriz = new int[10][10];
        Random r = new Random();
        int aleatorio = r.nextInt(100);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = r.nextInt(100);
            }

        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.format("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}




