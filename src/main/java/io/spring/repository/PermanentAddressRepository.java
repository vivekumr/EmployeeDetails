package io.spring.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.spring.entity.PermanentAddressEntity;
@Repository
public interface PermanentAddressRepository extends JpaRepository<PermanentAddressEntity, Serializable> {

}
