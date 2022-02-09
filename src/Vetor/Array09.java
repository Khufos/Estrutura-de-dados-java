package Vetor;

public class Array09 {
    private String[] elemento;
    private int tamanho;
    //Inicializando a class
    public Array09(int capacidade){
        this.elemento = new String[capacidade];
        this.tamanho = 0;
    }
    
    
    public boolean adicionar(String elemento)  {
        this.aumentaCapacide();
        if(this.tamanho < this.elemento.length){
                this.elemento[this.tamanho] = elemento;
                this.tamanho++;
                return true;
        }else{
            return false;
        } 
    }
    // 0 1 2 3 4 5 6 = tamanho 5 
    // B C E F G + +
    //
    public boolean adicionar(int posicao, String elemento){
        if(!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posicao invalida!!!!!!");
        }
        this.aumentaCapacide();
        // mover todos os elementos 
        for(int i=this.tamanho-1; i>=posicao; i--){
            this.elemento[i+1] = this.elemento[i];
        }
        this.elemento[posicao] = elemento;
        this.tamanho++;
        
        return true;
    }

    private void aumentaCapacide(){
        if(this.tamanho == this.elemento.length){
            String[] elementosNovos = new  String[this.elemento.length * 2]; 
            for(int i=0; i<this.elemento.length; i++) {
                elementosNovos[i] = this.elemento[i];

            }
            this.elemento = elementosNovos;
            
        }


    }
    
    // Essa busca a posicao do elemento pela posicao do vetor
    public String busca(int posicao) {

        if(!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posicao invalida!!!!!!");
        }
        return this.elemento[posicao];
            
    }
    //Essa busca a posicao pelo elemento 
    public int busca(String elemento){
        for(int i=0; i<this.tamanho; i++){
            if(this.elemento[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
   }
    // B G D E F -> posição a ser removida  é 1 {G}
    // 0 1 2 3 4 -> Tamanho do vetor é igual a 5
    // vetor[1] = vetor[2]
    // vetor[2] = vetor[3]
    // vetor[3] = vetor[4]

    public void remove(int posicao){
        if(!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posicao invalida!!!!!!");
        }
        for(int i=posicao; i<this.tamanho-1; i++){
            this.elemento[i] = this.elemento[i+1];

        }
        this.tamanho--;


    }

    public int tamanho(){
        return this.tamanho;
    }
    //retorna o array completo 
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i =0; i<this.tamanho-1; i++){
            s.append(this.elemento[i]);
            s.append(", ");
        }

        if(this.tamanho>0){
            s.append(this.elemento[this.tamanho- 1]);  
        }
        s.append("]");
        return s.toString();
    }
}
