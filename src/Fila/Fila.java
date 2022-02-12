package Fila;

import base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {
    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileira(T elemento) {
        // Exemplos de adicionar elementos em um arry
        // this.elementos[this.tamanho] = elemento;
        // this.tamanho++;
        // this.elemento[this.tamanho++] = elemento;

        // herdando codigo de base da estruturaEstatica .
        this.adiciona(elemento);
    }

    public T espiar() {
        return this.elementos[0];
    }

    public T desenfileira() {
        final int POS = 0;
        if (this.estaVazia()) {
            return null;
        }
        T elementoremov = this.elementos[POS];
        this.remove(POS);

        return elementoremov;
    }

}
