package one.digitalinnovation.workapi.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

import one.digitalinnovation.workapi.model.entity.DataType;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WorkCalendarDTO {

    private Long id;

    @NotNull
    private DataType dataType;

    @NotNull
    private String description;

    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING,
            pattern = "dd/MM/yyyy")
    private LocalDateTime specialDate;
}
