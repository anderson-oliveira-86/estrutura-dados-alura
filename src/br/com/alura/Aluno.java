package br.com.alura;

import java.util.Objects;

public class Aluno {

    private String nome;

    public Aluno(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return aluno.getNome().equals(this.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "Aluno{ nome = " + nome + " }";
    }
}