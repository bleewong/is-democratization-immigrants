package br.uam.lab.soft.adapter.web.mapper;

import br.uam.lab.soft.adapter.web.model.LoginUserDTO;
import br.uam.lab.soft.domain.LoginUser;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LoginUserMapper {

    LoginUserMapper instance = Mappers.getMapper(LoginUserMapper.class);

    LoginUser mapToDomain(LoginUserDTO loginUserDTO);

    LoginUserDTO mapToModel(LoginUser loginUser);

}
