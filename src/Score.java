
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Score {
    private String nome;
    private int pontuacao;

    public Score(String nome, int pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    @Override
    public String toString() {
        return pontuacao + " " + nome;
    }
}


