package com.estruturadedados.arrays.teste;

import com.estruturadedados.arrays.Vetor;

public class Teste04 {

    public static void main(String[] args) {

        /*
            Obter elemento de uma posição
         */


        Vetor vetor = new Vetor(10);

        vetor.adiciona("Elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");

        System.out.println(vetor.busca(15));


    }
}
