package com.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.entity.Insurance;
@Repository
public interface InsuranceRepository extends JpaRepository<Insurance, Integer> {

}
