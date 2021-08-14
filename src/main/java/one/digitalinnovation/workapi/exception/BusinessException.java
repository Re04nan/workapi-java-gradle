package one.digitalinnovation.workapi.exception;

import one.digitalinnovation.workapi.util.MessageUtils;

public class BusinessException extends RuntimeException{
    public BusinessException(MessageUtils e) {
        super(e.getMessage());
    }
}
