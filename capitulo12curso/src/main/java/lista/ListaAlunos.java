package lista;

public class ListaAlunos {
    final int QUANTIDADE_MINIMA = 2;
    Alunos[] lista = new Alunos[QUANTIDADE_MINIMA];

   Alunos obter (int indice){
       return lista[indice];
   }
    int tamanhoLista = 0;
    void adicionar(Alunos aluno){
        if (tamanhoLista == lista.length){
            Alunos[] novaLista = new Alunos[QUANTIDADE_MINIMA + lista.length];

            for (int i = 0 ; i < lista.length; i++){
                novaLista[i] = lista[i];
            }

            lista = novaLista;

        }

        lista[tamanhoLista] = aluno;

        tamanhoLista++;
    }
    void ordenar (Integer tamanhoLista){
        for (int i = 1 ; i< tamanhoLista; i++){
            Alunos alunoPosicaoBase = lista[i];

            int indicePosicaoBase = i;

            while (indicePosicaoBase > 0){
                int indicePosicaAnterior = indicePosicaoBase - 1;
                Alunos alunoPosicaAnterior = lista[indicePosicaAnterior];

                Boolean
                        alunoPosicaoAnteriorVemDepoisDe = alunoPosicaAnterior == null
                        || alunoPosicaAnterior.vemDepoisDe(alunoPosicaoBase);
                if (alunoPosicaoAnteriorVemDepoisDe){
                    lista[indicePosicaoBase] = lista[indicePosicaAnterior];

                    indicePosicaoBase--;
                } else {
                    break;
                }
            }

                lista[indicePosicaoBase] = alunoPosicaoBase;
        }

    }


}
