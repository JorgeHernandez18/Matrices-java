/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

/**
 *
 * @author DELL
 */
public class Ejercicio6 {

    int M[][] = {{8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30}, {9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31}, {10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32}, {8, 11, 24, 17, 20, 23, 26, 29, 32, 9, 12, 15}};

    public void mostrarMatriz() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public int temperaturaProm() {

        int aux = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 12; j++) {
                aux += M[i][j];
            }
        }
        //System.out.println("La temperatura promedio del año 2011 es de: " + (aux / 12));
        return aux / 12;
    }

    public void tempPromEstacionEsp() {
        for (int i = 0; i < 4; i++) {
            int aux = 0;
            for (int j = 0; j < 12; j++) {
                aux += M[i][j];
            }
            if (i == 1) {
                System.out.println("La temperatura promedio del año 2011 en la estación[" + (i + 1) + "] es de: " + (aux / 12));
            }

            if (i == 3) {
                System.out.println("La temperatura promedio del año 2011 de la estación[" + (i + 1) + "] es de: " + (aux / 12));

            }
        }
    }

    public void mesesTempPromSup() {

        for (int j = 0; j < 12; j++) {
            int aux = 0;
            int prom = 0;
            for (int i = 0; i < 4; i++) {
                aux += M[i][j];
            }
            prom = aux / 4;
            if (aux > temperaturaProm()) {
                switch (j + 1) {
                    case 1:
                        System.out.println("Enero");
                        break;

                    case 2:
                        System.out.println("Febrero");
                        break;

                    case 3:
                        System.out.println("Marzo");
                        break;

                    case 4:
                        System.out.println("Abril");
                        break;

                    case 5:
                        System.out.println("Mayo");
                        break;

                    case 6:
                        System.out.println("Junio");
                        break;

                    case 7:
                        System.out.println("Julio");
                        break;

                    case 8:
                        System.out.println("Agosto");
                        break;

                    case 9:
                        System.out.println("Septiembre");
                        break;

                    case 10:
                        System.out.println("Octubre");
                        break;

                    case 11:
                        System.out.println("Noviembre");
                        break;

                    case 12:
                        System.out.println("Diciembre");
                        break;

                }

            }
        }

    }

    public static void main(String[] args) {
        Ejercicio6 e = new Ejercicio6();

        e.mostrarMatriz();

        System.out.println("\nLa temperatura promedio del año 2011 es de: " + e.temperaturaProm());

        System.out.println("");

        e.tempPromEstacionEsp();
        
        System.out.println("");

        e.mesesTempPromSup();
    }
}
