package dev.castro.CadastroRpg.excecoes;

public class RecursoNaoEncontradoException extends RuntimeException{

    public RecursoNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}
