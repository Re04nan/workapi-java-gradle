package one.digitalinnovation.workapi.controller;

import one.digitalinnovation.workapi.model.dto.WorkloadDTO;
import one.digitalinnovation.workapi.service.WorkloadService;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping(path = "/workload")
@AllArgsConstructor
public class WorkloadController {

    @Autowired
    private WorkloadService workloadService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<WorkloadDTO> createWorkload(@RequestBody @Valid WorkloadDTO workloadDTO) {
        return ResponseEntity.ok(workloadService.save(workloadDTO));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<WorkloadDTO>> listAll() {

        return  ResponseEntity.ok(workloadService.listAll());
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<WorkloadDTO> findById(@PathVariable Long id) {

        return ResponseEntity.ok(workloadService.findById(id));
    }

    @PutMapping(
            path = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<WorkloadDTO> updateWorkload(@RequestBody @Valid WorkloadDTO workloadDTO,
                                   @PathVariable Long id) {

        return ResponseEntity.ok(workloadService.update(workloadDTO, id));
    }

    @DeleteMapping(
            path = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<WorkloadDTO>  deleteById(@PathVariable Long id) {

        return ResponseEntity.ok(workloadService.delete(id));
    }
}
