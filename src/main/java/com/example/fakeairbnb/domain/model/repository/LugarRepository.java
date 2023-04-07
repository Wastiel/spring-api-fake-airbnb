package com.example.fakeairbnb.domain.model.repository;

import com.example.fakeairbnb.domain.model.entity.Lugar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LugarRepository extends JpaRepository <Lugar, Long>{
}
