package br.uam.lab.soft.adapter.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OrderRepository extends MongoRepository<OrderEntity, Long> {

    List<OrderEntity> findAllByUserId(String email);

}
