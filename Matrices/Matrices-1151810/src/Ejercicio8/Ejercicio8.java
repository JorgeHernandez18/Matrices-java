/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

import java.util.Random;

/**
 *
 * @author DELL
 */
public class Ejercicio8 {

    Random r = new Random();
    int M[][] = new int[10][6];

    public void llenar() {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = r.nextInt(9);
            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print("[" + M[i][j] + "] ");
            }
            System.out.println("");
        }
    }

    public void modAgotado() {
        int aux = 0, it = 0;
        for (int i = 0; i < M.length; i++) {
            aux = 0;
            for (int j = 0; j < M[i].length; j++) {
                aux += M[i][j];
            }
            it = i;
        }
        if (aux == 30) {
            System.out.println("El modelo #" + (it + 1) + " esta agotado, pedir para el próximo semestre.");
        } else {
            System.out.println("Aún hay existencia de todos los modelos");
        }
    }

    public void modMenosV() {
        int v[] = new int[10];
        int c = 31, it = 0;
        for (int i = 0; i < M.length; i++) {
            int aux = 0;
            for (int j = 0; j < M[i].length; j++) {
                aux += M[i][j];
            }
            v[i] = aux;

            if (v[i] < c) {
                c = v[i];
                it = i;
            }
        }

        System.out.println("El modelo #" + (it + 1) + " fue el menos vendido");
    }

    public void mesMasV() {
        int c = 0, it = 0;
        int v[] = new int[6];
        for (int j = 0; j < M[0].length; j++) {
            int aux = 0;
            for (int i = 0; i < M.length; i++) {
                aux += M[i][j];
            }
            v[j] = aux;

            if (v[j] > c) {
                c = v[j];
                it = j;
            }
        }
        System.out.println("El mes #" + (it + 1) + " es en el que se han vendido más zapatos " + c);
    }

    public void mesMasV3y6() {
        int c = 0, d = 0, it = 0, it1 = 0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (i == 2 && M[i][j] > c) {
                    c = M[i][j];
                    it = j;
                }

                if (i == 5 && M[i][j] > d) {
                    d = M[i][j];
                    it1 = j;
                }
            }
        }
        System.out.println("El mes en que más se vendió el modelo 3 es: " + (it + 1));
        System.out.println("El mes en que más se vendió el modelo 6 es: " + (it1 + 1));
    }

    public void totalVendido() {
        int aux = 0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                aux += M[i][j];
            }
        }

        System.out.println("El total de pares vendidos en el primer semestre del año 2012 es: " + aux);
    }

    public static void main(String[] args) {
        Ejercicio8 e = new Ejercicio8();

        e.llenar();

        e.mostrar();

        e.modAgotado();

        e.modMenosV();

        e.mesMasV();

        e.mesMasV3y6();
        
        e.totalVendido();
    }
}
