package io.spring.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import io.spring.entity.OfficeAddressEntity;

@Repository
public interface OfficeAddressrepository extends JpaRepository<OfficeAddressEntity, Serializable>{

}
