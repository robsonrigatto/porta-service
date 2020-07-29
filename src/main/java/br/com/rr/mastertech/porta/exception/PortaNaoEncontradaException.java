package br.com.rr.mastertech.porta.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "porta não encontrada")
public class PortaNaoEncontradaException extends RuntimeException {
}
