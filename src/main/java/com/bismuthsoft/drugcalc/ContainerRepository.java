package com.bismuthsoft.drugcalc;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "containers", path = "containers")
public interface ContainerRepository extends PagingAndSortingRepository<Container, Long> {
    
    List<Container> findByName(@Param("name") String name);

}
