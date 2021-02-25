package br.com.alura.conjunto;

import java.util.HashSet;
import java.util.Set;

public class TesteConjunto {
    public static void main(String[] args) {

        Conjunto conjunto = new Conjunto();
        conjunto.adiciona("Mauricio");
        System.out.println(conjunto);
        conjunto.adiciona("Mauricio");
        System.out.println(conjunto);
        conjunto.adiciona("Marcelo");
        conjunto.adiciona("Guilherme");
        System.out.println(conjunto);

        conjunto.remove("Mauricio");
        System.out.println(conjunto);

        Set<String> conjuntoDoJava = new HashSet<>();

        conjuntoDoJava.add("Mauricio");
        System.out.println(conjunto);
        conjunto.adiciona("Marcelo");
        System.out.println(conjunto);
        conjunto.adiciona("Guilherme");
        System.out.println(conjunto);

        String x = "Guilherme";
        System.out.println(x.hashCode());
    }
}
