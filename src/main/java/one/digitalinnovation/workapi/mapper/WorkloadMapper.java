package one.digitalinnovation.workapi.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import one.digitalinnovation.workapi.model.dto.WorkloadDTO;
import one.digitalinnovation.workapi.model.entity.Workload;

import java.util.List;


@Mapper
public interface WorkloadMapper {

    WorkloadMapper INSTANCE = Mappers.getMapper(WorkloadMapper.class);

    Workload toModel(WorkloadDTO workloadDTO);
    WorkloadDTO toDTO(Workload workload);
    List<WorkloadDTO> toDTO(List<Workload> workloads);
}
