package br.edu.ifmt.biblioteca.exceptions;

import br.edu.ifmt.biblioteca.entities.Erro;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ResourceExceptionHandler {

    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    @ExceptionHandler(RegistroNaoEncontradoException.class)
    public Erro tratarExcecao(RegistroNaoEncontradoException exception) {
        String mensagem = exception.getMessage();
        return new Erro(mensagem);
    }

    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ArithmeticException.class)
    public Erro tratarExcecao(ArithmeticException exception) {
        String mensagem = exception.getMessage();
        return new Erro(mensagem);
    }

}
