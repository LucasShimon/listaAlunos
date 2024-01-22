package lista;

public class Alunos {
    String nome;

    boolean vemDepoisDe(Alunos alunos){
        if (alunos == null){
            return false;
        }
        return nome.compareTo(alunos.nome) > 0;
    }


}
