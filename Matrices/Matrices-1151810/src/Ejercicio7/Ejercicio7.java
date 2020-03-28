/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

import java.util.Random;

/**
 *
 * @author DELL
 */
public class Ejercicio7 {

    Random r = new Random();

    int[][] M = new int[50][4];

    public void llenar() {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = r.nextInt(2);
            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void votoCandidatos() {
        for (int j = 0; j < M[0].length; j++) {
            int aux = 0;
            for (int i = 0; i < M.length; i++) {
                aux += M[i][j];
            }
            System.out.println("\nEl candidato #" + (j + 1) + " obtuvo: " + aux + " votos");
        }
    }

    public void posicionFinal() {

        int c1 = 0, c2 = 0, c3 = 0, c4 = 0;

        for (int j = 0; j < M[0].length; j++) {
            int aux = 0;
            for (int i = 0; i < M.length; i++) {
                aux += M[i][j];
            }

            switch (j + 1) {

                case 1:
                    c1 = aux;
                    break;

                case 2:
                    c2 = aux;
                    break;

                case 3:
                    c3 = aux;
                    break;

                case 4:
                    c4 = aux;
                    break;

            }
            
            if(c1>c2 && c1>c3 && c1>c4 && c2>c3 && c2>c4 && c3>c4){
                System.out.println("Candidato #1: 1°\nCandidato#2: 2°\nCandidato#3: 3°\nCandidato#4: 4°");
            }else if(c2>c1 && c2>c3 && c2>c4 && c1>c3 && c1>c4 && c3>c4){
                System.out.println("Candidato #1: 2°\nCandidato#2: 1°\nCandidato#3: 3°\nCandidato#4: 4°");
            }else if(c3>c2 && c3>c1 && c1>c4 && c2>c3 && c2>c4 && c3>c4){
                System.out.println("Candidato #1: 1°\nCandidato#2: 2°\nCandidato#3: 3°\nCandidato#4: 4°");
            }
            
        }
    }

    public void ganador() {
        int con = 0, gan = 0;
        for (int j = 0; j < M[0].length; j++) {
            int aux = 0;
            for (int i = 0; i < M.length; i++) {
                aux += M[i][j];
            }
            if (aux > con) {
                con = aux;
                gan = j;
            }
        }
        System.out.println("\nEl candidato #" + (gan + 1) + " es el ganador con " + con + " votos");
    }

    public void menosVotos() {
        int con = 51, f = 0;
        for (int j = 0; j < M[0].length; j++) {
            int aux = 0;
            for (int i = 0; i < M.length; i++) {
                aux += M[i][j];
            }
            if (aux < con) {
                con = aux;
                f = j;
            }
        }
        System.out.println("\nEl candidato #" + (f + 1) + " es el perdedor con " + con + " votos");
    }

    public void voto5() {
        int aux = 0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (i == 4 && M[i][j] == 1) {
                    System.out.println("\nEl votante #" + (i + 1) + "voto por el candidato #" + (j + 1));
                }
            }

        }
    }

    public static void main(String[] args) {

        Ejercicio7 e = new Ejercicio7();

        e.llenar();

        e.mostrar();

        e.votoCandidatos();

        //e.posicionFinal();

        e.ganador();

        e.menosVotos();

        e.voto5();
    }
}
