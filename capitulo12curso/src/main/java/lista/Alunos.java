package lista;

public class Alunos {

    String nome;

    Alunos(String nome) {
        this.nome = nome;
    }

    String getNome() {
        return nome;
    }

    boolean vemDepoisDe(Alunos atividade) {
        if (atividade == null) {
            return false;
        }
        return nome.compareTo(atividade.nome) > 0;
    }


}
