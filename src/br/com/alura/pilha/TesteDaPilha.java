package br.com.alura.pilha;

import java.util.Stack;

public class TesteDaPilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.push("Mauricio");

        System.out.println(pilha);

        pilha.push("Guilherme");

        System.out.println(pilha);

        String r1 = pilha.pop();

        System.out.println(r1);

        String r2 = pilha.pop();

        System.out.println(r2);
        System.out.println("");
        System.out.println("Testando a classe Stack do JAVA");

        Stack<String> stack = new Stack<>();

        stack.push("Mauricio");
        stack.push("Marcelo");
        stack.push("Pedro");

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack);

    }
}
