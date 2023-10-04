import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public interface GerenciadorScore {
    void adicionarScore(Score score) throws IOException;
    List<Score> listarScores() throws IOException;
}


