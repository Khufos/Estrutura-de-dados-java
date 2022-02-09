package Vetor;

import java.util.ArrayList;

public class Aula11 {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("A");
		arrayList.add("C");
		// Adicionando um elemento na posição escolhida pelo usuario
		arrayList.add(1, "B");
		// Ultilizando o metodo de busca contains metodo de busca
		// teste metodo contains retorna um valor boolean de verdadeiro ou falso
		// se o elemento estiver na lista
		System.out.println(arrayList);
		boolean existe = arrayList.contains("A");
		if (existe) {
			System.out.println("O elemento existe no array: " + existe);
		} else {
			System.out.println("O elemento não existe no array:" + existe);
		}
		// o indexof retorna exatamente o indice que o objeto se encontra .
		int pos = arrayList.indexOf("B");
		if (pos > -1) {
			System.out.println("O elemento existe no array na posicão:" + pos);
		} else {
			System.out.println("O elemento não existe no array:" + pos);
		}
		// ===============================================//
		// busca por posição se usar o get
		System.out.println("Na posição 2 vai retorna o elemento:" + arrayList.get(2));
		// metodo para remover um elemento da lista existe dois modos de remover o
		// elemento
		// lista , o primeiro pelo indice e outro pelo proprio objeto
		arrayList.remove(0);
		arrayList.remove("B");
		System.out.println(arrayList);
		// Como mostra o tamanho da lista
		System.out.println(arrayList.size());

	}

}