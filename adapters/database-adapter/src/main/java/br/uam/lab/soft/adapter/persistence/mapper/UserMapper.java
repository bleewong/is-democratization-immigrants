package br.uam.lab.soft.adapter.persistence.mapper;

import br.uam.lab.soft.adapter.persistence.UserEntity;
import br.uam.lab.soft.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper instance = Mappers.getMapper(UserMapper.class);

    @Mappings({
            @Mapping(source = "phoneNumber", target = "phone"),
            @Mapping(source = "email", target = "email")
    })
    UserEntity mapToEntity(User user);

    @Mappings({
            @Mapping(source = "phone", target = "phoneNumber"),
            @Mapping(source = "email", target = "email")
    })
    User mapToDomain(UserEntity userEntity);

}
