package one.digitalinnovation.workapi.util;

import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter
@AllArgsConstructor
public enum MessageUtils {

    WORKLOAD_NOT_FOUND("Could not found the workload"),
    WORKLOAD_ALREADY_REGISTERED("Workload alredy registered in database");

    private final String message;
}
