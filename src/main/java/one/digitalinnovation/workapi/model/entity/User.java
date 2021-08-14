package one.digitalinnovation.workapi.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column
    private BigDecimal tolerance;

    @Column(nullable = false)
    private LocalDateTime startWork;

    @Column(nullable = false)
    private LocalDateTime endWork;

    @ManyToOne
    private UserType userType;

    @ManyToOne
    private Company company;

    @ManyToOne
    private AccessLevel accessLevel;

    @ManyToOne
    private Workload workload;

}
