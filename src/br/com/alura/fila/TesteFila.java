package br.com.alura.fila;

import java.util.LinkedList;
import java.util.Queue;

public class TesteFila {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.adiciona("Mauricio");
        fila.adiciona("Guilherme");
        System.out.println(fila);

        String x1 = fila.remove();

        System.out.println(x1);

        System.out.println(fila);

        System.out.println("Testando a classe Queue do JAVA");

        Queue<String> filaDoJava = new LinkedList<>();

        filaDoJava.add("Mauricio");
        filaDoJava.add("Guilherme");
        System.out.println(filaDoJava);


        String x2 = filaDoJava.poll();
        System.out.println(x2);
        System.out.println(filaDoJava);

    }
}
