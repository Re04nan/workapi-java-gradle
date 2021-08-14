package one.digitalinnovation.workapi.model.dto;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HoursStoreDTO {

    public class HoursStoreIdDTO implements Serializable {
        private Long idHoursStore;
        private Long idMovement;
        private Long idUser;

    }

    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING,
            pattern = "dd/MM/yyyy")
    private LocalDateTime workDay;

    @NotNull
    private BigDecimal workHours;

    @NotNull
    private BigDecimal balanceHours;

    @NotNull
    private HoursStoreIdDTO id;
}
