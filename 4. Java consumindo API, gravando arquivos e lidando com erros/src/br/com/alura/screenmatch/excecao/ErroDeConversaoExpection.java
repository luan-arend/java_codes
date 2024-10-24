package br.com.alura.screenmatch.excecao;

public class ErroDeConversaoExpection extends RuntimeException {
    private String message;

    public ErroDeConversaoExpection(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
