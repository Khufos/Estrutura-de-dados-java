package Vetor;

import java.util.Arrays;

public class Array04 {
    private String[] elemento;
    private int indexTamanho;
    public Array04(int capacidade){
        this.elemento = new String[capacidade];
        this.indexTamanho = 0;
    }
    
   
    public boolean adicionar(String elemento)  {
        if(this.indexTamanho < this.elemento.length){
                System.out.println("Aqui está o elemento :" + elemento);
                this.elemento[this.indexTamanho] = elemento;
                this.indexTamanho++;
                return true;
        }else{
            return false;
        } 
    } 
    public int tamanho(){
        return this.indexTamanho;
    }
    //retorna o array completo 
    public String toString(){
        return Arrays.toString(elemento);
    }
    
}
