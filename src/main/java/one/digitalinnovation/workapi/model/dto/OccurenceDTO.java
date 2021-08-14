package one.digitalinnovation.workapi.model.dto;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.validation.constraints.NotEmpty;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OccurenceDTO {

    private Long id;

    @NotEmpty
    private String name;

    private String description;
}
