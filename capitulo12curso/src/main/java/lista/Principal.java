package lista;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) throws IOException {


        ListaAlunos lista = new ListaAlunos();

        System.out.println("------------------------------");

        Alunos aluno = new Alunos();
        aluno.nome = "Thiago";
        lista.adicionar(aluno);

        aluno = new Alunos();
        aluno.nome = "Maria";
        lista.adicionar(aluno);

        aluno = new Alunos();
        aluno.nome = "Alexandre";
        lista.adicionar(aluno);

        aluno = new Alunos();
        aluno.nome = "Shimon";
        lista.adicionar(aluno);

        aluno = new Alunos();
        aluno.nome = "José";
        lista.adicionar(aluno);
// primeiro comando da lista


        iterar(lista);

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> Linhas2 = new ArrayList<>();

        iterar(lista);

        Path arquivo = Paths.get("/home/lucaslimashimon/aula/arquivo.txt");

        Files.write(arquivo, Linhas2);


        Path arquivoss = Paths.get("/home/lucaslimashimon/aula/arquivo.txt");

        Files.readAllLines(arquivoss);


        lista.ordenar();




        //lendo o arquivo


        ArrayList<String> LinhasDois = new ArrayList<>();

        lista.ordenar();
        iterar(lista);

        Path arquivosDois = Paths.get("/home/lucaslimashimon/aula/arquivo2.txt");
        Files.write(arquivo, Linhas2);

        scanner.close();
    }
    static void iterar(ListaAlunos listaAlunos) {
        for (int i = 0; i < listaAlunos.tamanhoLista; i++) {
            Alunos a = listaAlunos.obter(i);
            if (a != null) {

                System.out.println("Aluno " + a.nome);
            } else {
                System.out.println("Aluno sem nome");
            }
        }
        System.out.println("------------------------------");

    }
}