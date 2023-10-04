import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class GerenciadorScoresArquivo implements GerenciadorScores{
    private String arquivoScores = "scores.txt";

    @Override
    public void adicionarScore(Score score) throws IOException {
        try (FileWriter writer = new FileWriter(arquivoScores, true);
             BufferedWriter bufferedWriter = new BufferedWriter(writer);
             PrintWriter printWriter = new PrintWriter(bufferedWriter)) {

            printWriter.println(score.getPontuacao() + " " + score.getNome());
        }
    }

    @Override
    public List<Score> listarScores() throws IOException {
        List<Score> scores = new ArrayList<>();
        try (FileReader reader = new FileReader(arquivoScores);
             BufferedReader bufferedReader = new BufferedReader(reader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(" ");
                int pontuacao = Integer.parseInt(parts[0]);
                String nome = parts[1];
                scores.add(new Score(nome, pontuacao));
            }
        }
        return scores;
    }
}
