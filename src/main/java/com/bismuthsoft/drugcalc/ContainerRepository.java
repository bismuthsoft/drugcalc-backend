package com.bismuthsoft.drugcalc;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
public interface ContainerRepository extends CrudRepository<Container, Long> {
    
    List<Container> findByName(@Param("name") String name);

}
