package org.vanderli.com.helpdesk.presentation.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.vanderli.com.helpdesk.domain.entity.ChamadoEntity;
import org.vanderli.com.helpdesk.infra.data.ChamadoData;
import org.vanderli.com.helpdesk.presentation.dto.ChamadoDTO;
import org.vanderli.com.helpdesk.presentation.dto.CriarChamadoDTO;

@Mapper(componentModel = "cdi")
public interface ChamadoMapper {

    // De CriarChamadoDTO para ChamadoEntity
    ChamadoEntity toEntity(CriarChamadoDTO dto);

    // De ChamadoEntity para ChamadoDTO
    ChamadoDTO toDTO(ChamadoEntity entity);

    // De ChamadoEntity para ChamadoData
    ChamadoData toData(ChamadoEntity entity);


    // De ChamadoData para ChamadoEntity
    ChamadoEntity toEntity(ChamadoData data);

}
