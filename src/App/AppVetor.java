package App;

import Vetor.*;

public class AppVetor {
    public static void main(String[] args) throws Exception {

        Lista<Contato> vetor = new Lista<Contato>(1);

        Contato c1 = new Contato("Contato 1 ", "123213-213321", "contato@gmail.com");
        vetor.adiciona(c1);

    }
}
