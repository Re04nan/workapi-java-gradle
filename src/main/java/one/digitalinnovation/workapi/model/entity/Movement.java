package one.digitalinnovation.workapi.model.entity;

import lombok.*;

import javax.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Movement {

    @Embeddable
    @EqualsAndHashCode
    @AllArgsConstructor
    public class MovementId implements Serializable {
        private Long idMovement;
        private Long idUser;
    }

    @Column(nullable = false)
    private LocalDateTime entryDate;

    @Column(nullable = false)
    private LocalDateTime exitDate;

    @Column(nullable = false)
    private BigDecimal period;

    @EmbeddedId
    private MovementId id;

    @ManyToOne
    private Occurrence occurrence;

    @ManyToOne
    private WorkCalendar workCalendar;

}
