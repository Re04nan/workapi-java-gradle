package one.digitalinnovation.workapi.model.dto;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import one.digitalinnovation.workapi.model.entity.AccessLevel;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LocationDTO {

    private  Long id;

    @NotEmpty
    private String description;

    @NotNull
    private AccessLevel accessLevel;
}
