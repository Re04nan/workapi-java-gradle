package one.digitalinnovation.workapi.model.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EmbeddedId;
import javax.persistence.Embeddable;

import java.math.BigDecimal;
import java.io.Serializable;
import java.time.LocalDateTime;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class HoursStore {

    @Embeddable
    @EqualsAndHashCode
    @AllArgsConstructor
    public class HoursStoreId implements Serializable {
        private Long idHoursStore;
        private Long idMovement;
        private Long idUser;

    }

    @Column(nullable = false)
    private LocalDateTime workDay;

    @Column(nullable = false)
    private BigDecimal workHours;

    @Column(nullable = false)
    private BigDecimal balanceHours;

    @EmbeddedId
    private HoursStoreId id;

}
