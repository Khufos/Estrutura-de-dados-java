package Vetor;

public class Array06 {
    private String[] elemento;
    private int indexTamanho;
    //Inicializando a class
    public Array06(int capacidade){
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

    // Essa busca a posicao do elemento pela posicao do vetor
    public String busca(int posicao) {

        if(!(posicao >= 0 && posicao < this.indexTamanho)) {
            throw new IllegalArgumentException("Posicao invalida!!!!!!");
        }
        return this.elemento[posicao];
            
    }
    //Essa busca a posicao pelo elemento 
    public int busca(String elemento){
        for(int i=0; i<this.indexTamanho; i++){
            if(this.elemento[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
   }


    public int tamanho(){
        return this.indexTamanho;
    }
    //retorna o array completo 
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i =0; i<this.indexTamanho-1; i++){
            s.append(this.elemento[i]);
            s.append(", ");
        }

        if(this.indexTamanho>0){
            s.append(this.elemento[this.indexTamanho - 1]);  
        }
        s.append("]");
        return s.toString();
    }
    
}
