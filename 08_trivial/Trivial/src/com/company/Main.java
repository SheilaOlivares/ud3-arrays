package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

    public class Main {

        public static void main(String[] args) throws IOException {

            String[] preguntas = {
                    "¿Cómo se le llama a un grupo de lobos?",
                    "¿Cuál es el nombre de la mascota de Mickey Mouse?",
                    "¿El escorbuto es el resultado de una deficiencia de qué vitamina?",
                    "¿Qué ave era usada como mensajera?"
            };

            String[] respuestas = {
                    "Manada",
                    "Pluto",
                    "Vitamina C",
                    "Paloma"
            };

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            Random r = new Random();
            int correctas = 0;
            int incorrectas = 0;
            char respuesta;


            do {

                int aleatorio = r.nextInt(preguntas.length);

                System.out.println("Pregunta: " + preguntas[aleatorio]);

                System.out.print("Pulsa <ENTER> para ver la respuesta...");
                br.readLine();

                System.out.println("La respuesta es: " + respuestas[aleatorio]);
                System.out.println();

                System.out.print("¿Has acertado? (si|no):");
                respuesta = br.readLine().toLowerCase().charAt(0);
                if (respuesta == 's') {
                    correctas++;
                } else {
                    incorrectas++;
                }

                System.out.print("¿Quieres continuar? (s|n): ");
                respuesta = br.readLine().toLowerCase().charAt(0);
            } while (respuesta != 'n');

            System.out.println("Has obtenido" +correctas+" respuestas correctas");
            System.out.println("Has obtenido" +incorrectas+" respuestas incorrectas");
        }
    }

