package com.estruturadedados.arrays.teste;

import com.estruturadedados.arrays.Vetor;

public class Teste03 {

    public static void main(String[] args) {
         /*

         Verificar tamanho e imprimir elementos do vetor
          */

        Vetor vetor = new Vetor(10);

        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");

        System.out.println(vetor.tamanho());

        System.out.println(vetor.toString());





    }

}
