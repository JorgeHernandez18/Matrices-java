/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author DELL
 */
public class Ejercicio3 {

    int M[][] = {{1, 2}, {3, 4}, {5, 6}};

    public void leerMatriz() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void sumaFilas() {

        for (int i = 0; i < 3; i++) {
            int fi = 0;
            for (int j = 0; j < 2; j++) {
                fi += M[i][j];
            }
            System.out.println("\nSuma de filas: [" + i + "] es: " + fi);

        }
    }

    public void sumaColumnas() {

        for (int j = 0; j < 2; j++) {
            int col = 0;
            for (int i = 0; i < 3; i++) {
                col += M[i][j];
            }
            System.out.println("\n La suma de la columna[" + j + "] es: " + col);
        }
    }

    public static void main(String[] args) {
        Ejercicio3 e = new Ejercicio3();

        e.leerMatriz();

        e.sumaFilas();

        e.sumaColumnas();
    }
}
