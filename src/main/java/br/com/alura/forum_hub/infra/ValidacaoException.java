package br.com.alura.forum_hub.infra;

public class ValidacaoExceptionextends RuntimeException {
    public ValidacaoException(String mensagem) {
        super (mensagem);
    }
}
