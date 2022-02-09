package Vetor;

public class Array01 {
    private String[] elementos;
    
    public Array01 (int capacidade){
        this.elementos = new String[capacidade];
    }
// Essa logica não é muito boa  passe pro exemplo do vetor 03
    public void adicionar(String elemento){

        for (int i = 0; i<this.elementos.length; i++ ){
            if(this.elementos == null){
                this.elementos[i] = elemento;
                break;
            }
        }
    }

}
