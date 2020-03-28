/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author DELL
 */
public class Ejercicio2 {

    int T[][] = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10}};

    public void LeerMatriz() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(T[i][j] + " ");

            }
            System.out.println("");
        }
    }

    public void SumaElementos() {
        int aux = 0;
        int aux1 = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++) {
                if (T[i][j] > 0) {
                    aux += T[i][j];
                } else {
                    aux1 += T[i][j];
                }
            }
        }

        System.out.println("Suma elementos positivos es de: " + aux + ", Suma de elementos negativos: " + aux1);

    }

    public static void main(String[] args) {
        Ejercicio2 e = new Ejercicio2();

        e.LeerMatriz();

        e.SumaElementos();

    }

}
