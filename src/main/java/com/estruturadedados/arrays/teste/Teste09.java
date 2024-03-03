package com.estruturadedados.arrays.teste;

import com.estruturadedados.arrays.VetorObjetos;

public class Teste09 {

    public static void main(String[] args) {
        /*
        Generalizar o tipo do vetor
       */

        VetorObjetos vetor = new VetorObjetos(3);

        Contato c1 = new Contato("Contato 1", "1234-4565", "contato1@email.com");
        Contato c2 = new Contato("Contato 2", "2343-6665", "contato2@email.com");
        Contato c3 = new Contato("Contato 3", "5132-4775", "contato3@email.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println("Tamanho = " + vetor.tamanho());

        int pos = vetor.busca(c1);
        if (pos > -1) {
            System.out.println("Elemento existe no vetor");
        } else {
            System.out.println("Elemento não existe no vetor");
        }


        System.out.println(vetor);




    }
}
