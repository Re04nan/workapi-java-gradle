package one.digitalinnovation.workapi.model.dto;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import one.digitalinnovation.workapi.model.entity.Company;
import one.digitalinnovation.workapi.model.entity.UserType;
import one.digitalinnovation.workapi.model.entity.Workload;
import one.digitalinnovation.workapi.model.entity.AccessLevel;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private Long id;

    @NotNull
    @Size(min = 3)
    private String name;

    private BigDecimal tolerance;

    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING,
            pattern = "dd/MM/yyyy")
    private LocalDateTime startWork;

    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING,
            pattern = "dd/MM/yyyy")
    private LocalDateTime endWork;

    @NotNull
    private UserType userType;

    @NotNull
    private Company company;

    @NotNull
    private AccessLevel accessLevel;

    @NotNull
    private Workload workload;
}
