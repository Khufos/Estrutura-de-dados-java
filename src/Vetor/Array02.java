package Vetor;

public class Array02 {
    private String[] elemento;
    private int indexTamanho;
    public Array02(int capacidade){
        this.elemento = new String[capacidade];
        this.indexTamanho = 0;
    }

    //Opções melhores de resolver esse codigo no Vetor04
    public void adicionar(String elemento) throws Exception{
        if (this.indexTamanho < this.elemento.length){
            this.elemento[this.indexTamanho] = elemento;
            this.indexTamanho++;
        }else{
            throw new Exception("A capacidade do vetor é menor do que o número de elementos que entram nele.");
        } 
        
       
    }    
}
