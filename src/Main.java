import java.io.IOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        GerenciadorScores gerenciador = new GerenciadorScoresArquivo();

        while (true) {
            System.out.println("MENU PRINCIPAL");
            System.out.println("(1) Adicionar score");
            System.out.println("(2) Listar scores");
            System.out.println("(3) Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer

            if (opcao == 1) {
                System.out.print("Nome do jogador: ");
                String nome = scanner.nextLine();
                System.out.print("Pontuação: ");
                int pontuacao = scanner.nextInt();
                scanner.nextLine();  // Limpar o buffer

                Score score = new Score(nome, pontuacao);
                gerenciador.adicionarScore(score);
                System.out.println("Score adicionado!");
            } else if (opcao == 2) {
                List<Score> scores = gerenciador.listarScores();
                System.out.println("Lista de scores:");
                for (Score score : scores) {
                    System.out.println(score);
                }
            } else if (opcao == 3) {
                System.out.println("Saindo do programa. Até mais!");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

    }
}