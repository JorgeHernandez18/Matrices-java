/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
   l m m j v s d
d1 1 2 3 4 5 6 7 
d2 1 2 3 4 5 6 7 
d3 1 2 3 4 5 6 7 
d4 1 2 3 4 5 6 7 
d5 1 2 3 4 5 6 7 
d6 1 2 3 4 5 6 7 
d7 1 2 3 4 5 6 7 
d8 1 2 3 4 5 6 7 
 */
package Ejercicio5;

/**
 *
 * @author DELL
 */
public class Ejercicio5 {

    int M[][] = {{1, 2, 3, 4, 5, 6, 7}, {1, 2, 3, 4, 5, 6, 6}, {1, 2, 3, 4, 5, 6, 8}, {1, 2, 3, 4, 5, 6, 9}, {1, 2, 3, 4, 5, 6, 7}, {1, 2, 3, 4, 5, 6, 7}, {1, 2, 3, 4, 5, 6, 10}, {1, 2, 3, 4, 5, 6, 4}};

    public void leerMatriz() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void trabajadoresDiaSemana() {

        for (int j = 0; j < 7; j++) {
            int aux = 0;
            for (int i = 0; i < 8; i++) {
                aux += M[i][j];
            }
            System.out.print("\n Cantidad de trabajadores que laboraron el dia #[" + (j + 1) + "] son: " + aux);

        }

    }

    public void departamentoMasAsistieron() {

        int aux1 = 0;
        int it = 0;
        for (int i = 0; i < 8; i++) {
            int aux = 0;
            for (int j = 0; j < 7; j++) {
                aux += M[i][j];

            }
            if (aux > aux1) {
                aux1 = aux;
                it = i;
            }

        }

        System.out.println("\n En el departamento [" + (it + 1) + "] asisitieron: " + aux1 + " trabajadores");

    }

    public void trabajadoresSabDom() {

        for (int j = 0; j < 7; j++) {
            int aux = 0;
            for (int i = 0; i < 8; i++) {
                aux += M[i][j];
            }
            if (j == 5) {
                System.out.println("La cantidad de trabajadores que asistieron el dia Sabado es: " + aux);
            }
            if (j == 6) {
                System.out.println("La cantidad de trabajadores que asistieron el dia Domingo es: " + aux);
            }
        }
    }
    
    public void departamentoMenosAsist()
    {
        int aux1=1000;
        int it=0;
        for (int i = 0; i < 8; i++) {
            int aux=0;
            for (int j = 0; j < 7; j++) {
                aux+=M[i][j];
            }
            if(aux<aux1)
            {
                aux1=aux;
                it=i;
            }
        }
        
        System.out.println("\n En el departamento [" + (it + 1) + "] asisitieron: " + aux1 + " trabajadores");

        
    }

    public static void main(String[] args) {
        Ejercicio5 e = new Ejercicio5();

        e.leerMatriz();

        e.trabajadoresDiaSemana();

        e.departamentoMasAsistieron();

        e.trabajadoresSabDom();
        
        e.departamentoMenosAsist();
    }
}
