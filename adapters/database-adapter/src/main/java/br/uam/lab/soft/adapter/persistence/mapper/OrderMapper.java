package br.uam.lab.soft.adapter.persistence.mapper;

import br.uam.lab.soft.adapter.persistence.OrderEntity;
import br.uam.lab.soft.domain.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order mapToDomain(OrderEntity entity);

    OrderEntity mapToEntity(Order domain);

}
