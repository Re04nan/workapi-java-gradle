package one.digitalinnovation.workapi.repository;

import one.digitalinnovation.workapi.model.entity.Workload;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface WorkloadRepository extends JpaRepository<Workload, Long> {
    Optional<Workload> findByDescription(String description);
}
