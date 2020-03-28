/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 */
package Ejercicio4;

/**
 *
 * @author DELL
 */
public class Ejercicio4 {
    
    int B[][]={{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};

    public void leerMatriz()
    {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(B[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public void sumasMatriz()
    {
        int aux=0;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                aux+=B[i][j];
            }
        }
        System.out.println(aux);
    }
    
    public static void main(String[] args) {
        Ejercicio4 e = new Ejercicio4();
        
        e.leerMatriz();
        
        System.out.println("");
        
        e.sumasMatriz();
    }
}
