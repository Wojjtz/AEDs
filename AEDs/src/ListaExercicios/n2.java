/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaExercicios;

/**
 *
 * @author 0057149
 */
public class n2 {
    public static void main(String[] args) {
        int vet[] = {1, 2, 3, 4};
        int start = 0;
        int maior = 0;
        System.out.println(imprimirVetor(vet, start, maior));
    }
    
    static int imprimirVetor(int v[], int s, int m){
        if(m == 0){
            m = v[s];
        }
        if(s < v.length){
           if(v[s] >= m){
               m = v[s];
           }
           s++;
        }
        return imprimirVetor(v, s, m);
    }
}
