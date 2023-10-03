/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasLineares;

/**
 *
 * @author rodol
 */
public class Main {
    static ListaAlunos lista = new ListaAlunos();
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Sam Sulek", 1);
        Aluno a2 = new Aluno("Sérgio Foguetes", 2);
        
        checarVazia();
        checarCheia();
        
        lista.insereAlunoNaPosicao(a1, 0);
        lista.insereAlunoNaPosicao(a2, 1);
        
        checarCheia();
        
        lista.apagarLista();
        
        checarVazia();
        
    }
    public static void checarVazia(){
        if (lista.vazia()) {
            System.out.println("Vazia");
        }else{
            System.out.println("Não vazia");
        }
    }
    public static void checarCheia(){
        if (lista.cheia()) {
            System.out.println("Cheia");
        }else{
            System.out.println("Não cheia");
        }
          
    }
}
