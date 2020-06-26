package br.uam.lab.soft.adapter.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface OperationStatusRepository extends MongoRepository<OperationStatusEntity, String> {
}
