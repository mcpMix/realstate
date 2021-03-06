package br.com.realstate.commos.utils.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuportedMathOperationException extends RuntimeException{

    private static final long serialVersionUID = -2681667818854998413L;

    public UnsuportedMathOperationException(String exception) {
        super(exception);
    }
}
