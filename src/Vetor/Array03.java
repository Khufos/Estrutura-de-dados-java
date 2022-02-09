package Vetor;

public class Array03 {
    private String[] elemento;
    private int indexTamanho;
    public Array03(int capacidade){
        this.elemento = new String[capacidade];
        this.indexTamanho = 0;
    }
    
    //Opções melhores de resolver esse codigo no Vetor04
    public boolean adicionar(String elemento)  {
        if(this.indexTamanho < this.elemento.length){
                this.elemento[this.indexTamanho] = elemento;
                this.indexTamanho++;
                return true;
        }else{
            return false;
        } 
            
           
    }    
    
}
