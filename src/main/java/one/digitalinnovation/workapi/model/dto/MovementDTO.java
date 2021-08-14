package one.digitalinnovation.workapi.model.dto;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import one.digitalinnovation.workapi.model.entity.Occurrence;
import one.digitalinnovation.workapi.model.entity.WorkCalendar;

import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MovementDTO {

    public class MovementIdDTO implements Serializable {
        private Long idMovement;
        private Long idUser;
    }

    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING,
            pattern = "dd/MM/yyyy")
    private LocalDateTime entryDate;

    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING,
            pattern = "dd/MM/yyyy")
    private LocalDateTime exitDate;

    @NotNull
    private BigDecimal period;

    @NotNull
    private MovementIdDTO id;

    @NotNull
    private Occurrence occurrence;

    @NotNull
    private WorkCalendar workCalendar;
}
