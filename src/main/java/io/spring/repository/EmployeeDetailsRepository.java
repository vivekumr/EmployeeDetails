package io.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.spring.entity.EmployeeDetailsEntity;

@Repository
public interface EmployeeDetailsRepository extends CrudRepository<EmployeeDetailsEntity,Integer> {

}
