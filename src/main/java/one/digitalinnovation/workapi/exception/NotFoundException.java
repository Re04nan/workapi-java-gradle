package one.digitalinnovation.workapi.exception;

import one.digitalinnovation.workapi.util.MessageUtils;

public class NotFoundException extends RuntimeException {
    public NotFoundException(MessageUtils e) {
        super(e.getMessage());
    }
}
