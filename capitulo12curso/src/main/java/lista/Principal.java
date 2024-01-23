package lista;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws IOException {

        Path arquivo = Paths.get("/home/lucaslimashimon/aula/arquivo.txt");

        List<String> linhas = Files.readAllLines(arquivo);

        ListaAlunos listaAtividades = new ListaAlunos();

        for (String nome : linhas) {
            Alunos atividade = new Alunos(nome);
            listaAtividades.adicionarAtividade(atividade);
        }

        listaAtividades.ordenar();

        Path arquivoOrdenado = Paths.get("/home/lucaslimashimon/aula/arquivoOrdenado.txt");

        List<String> nomesOrdenados = new ArrayList<>();
        for (Alunos atividade : listaAtividades.getAtividades()) {
            nomesOrdenados.add(atividade.getNome());
        }

        Files.write(arquivoOrdenado, nomesOrdenados);

    }
}