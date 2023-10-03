/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasLineares;

/**
 *
 * @author rodol
 */
public class ListaAlunos {

    private final int max = 2;
    private int nAtualAlunos;
    private Aluno[] lista;

    public ListaAlunos() {
        this.lista = new Aluno[max];
    }

    public void apagarLista() {
        this.lista = new Aluno[max];
    }

    public boolean vazia() {
        for (int i = 0; i < this.lista.length; i++) {
            if (this.lista[i] != null) {
                return false;
            }
        }
        return true;
    }

    public boolean cheia() {
        int contador = 0;
        for (int i = 0; i < this.lista.length; i++) {
            if (this.lista[i] != null) {
                contador++;
            }
        }
        if (contador == this.lista.length) {
            return true;
        } else {
            return false;
        }
    }

    public void insereAlunoNaPosicao(Aluno aluno, int posicao) {
        if (posicao < this.lista.length && posicao >= 0) {
            if (!cheia()) {
                if (this.lista[posicao] == null) {
                    this.lista[posicao] = aluno;
                } else {
                    System.out.println("Está posição já está sendo usada.");
                }
            } else {
                System.out.println("Lista cheia.");
            }
        } else {
            System.out.println("Posição maior que o tamanho do array ou menor que zero.");
        }
    }
}
