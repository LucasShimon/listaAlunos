package lista;

import java.util.ArrayList;
import java.util.List;

public class ListaAlunos {

    private List<Alunos> atividades;

    public ListaAlunos() {
        atividades = new ArrayList<>();
    }

    public void adicionarAtividade(Alunos atividade) {
        atividades.add(atividade);
    }

    public void ordenar() {
        int tamanhoLista = atividades.size();

        for (int i = 1; i < tamanhoLista; i++) {
            Alunos atividadePosicaoBase = atividades.get(i);
            int indicePosicaoBase = i;

            while (indicePosicaoBase > 0) {
                int indicePosicaoAnterior = indicePosicaoBase - 1;
                Alunos atividadePosicaoAnterior = atividades.get(indicePosicaoAnterior);

                Boolean atividadePosicaoAnteriorVemDepoisDe = atividadePosicaoAnterior == null ||
                        atividadePosicaoAnterior.vemDepoisDe(atividadePosicaoBase) ;

                if (atividadePosicaoAnteriorVemDepoisDe) {
                    atividades.set(indicePosicaoBase, atividadePosicaoAnterior);

                    indicePosicaoBase--;
                } else {
                    break;
                }
            }

            atividades.set(indicePosicaoBase, atividadePosicaoBase);
        }
    }

    public List<Alunos> getAtividades() {
        return atividades;
    }
}