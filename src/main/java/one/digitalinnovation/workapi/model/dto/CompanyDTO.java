package one.digitalinnovation.workapi.model.dto;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.br.CNPJ;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDTO {

    private Long id;

    private String description;

    @CNPJ
    @NotEmpty
    private String cnpj;

    @NotEmpty
    private String address;

    @NotEmpty
    private String district;

    @NotEmpty
    private String city;

    @NotEmpty
    private String state;

    @NotBlank
    private String telephone;
}
