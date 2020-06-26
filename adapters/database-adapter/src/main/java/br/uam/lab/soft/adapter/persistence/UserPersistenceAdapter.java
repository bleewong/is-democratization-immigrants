package br.uam.lab.soft.adapter.persistence;

import br.uam.lab.soft.adapter.persistence.mapper.OrderMapper;
import br.uam.lab.soft.adapter.persistence.mapper.UserMapper;
import br.uam.lab.soft.application.exception.UserNotFoundException;
import br.uam.lab.soft.application.port.out.LoadOrderPort;
import br.uam.lab.soft.application.port.out.LoadUserPort;
import br.uam.lab.soft.common.PersistenceAdapter;
import br.uam.lab.soft.domain.Order;
import br.uam.lab.soft.domain.User;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@PersistenceAdapter
public class UserPersistenceAdapter implements LoadUserPort, LoadOrderPort {

    private UserRepository userRepository;
    private OrderRepository orderRepository;

    @Override
    public User getUserByEmail(String email) {
        UserEntity userEntity = userRepository.findById(email)
                .orElseThrow(() -> new UserNotFoundException("Usuario no existe"));
        return UserMapper.instance.mapToDomain(userEntity);
    }

    @Override
    public List<Order> getAllOrdersByUserId(String userId) {
        return orderRepository.findAllByUserId(userId)
                .stream()
                .map(o -> OrderMapper.INSTANCE.mapToDomain(o))
                .collect(Collectors.toList());
    }

}
