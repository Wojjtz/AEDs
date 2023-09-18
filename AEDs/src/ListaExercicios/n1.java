/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaExercicios;

/**
 *
 * @author 0057149
 */
public class n1 {
    public static void main(String[] args) {
        int vet[] = {1, 2, 3, 4};
        int start = 0;
        
        imprimirVetor(vet, start);
    }
    
    static void imprimirVetor(int v[], int s){
        if(s < v.length){
           System.out.println(v[s]);
           s++;
           imprimirVetor(v, s);
        }
    }
}
