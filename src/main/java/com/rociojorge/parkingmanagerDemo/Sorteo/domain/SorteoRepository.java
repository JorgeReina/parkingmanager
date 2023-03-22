package com.rociojorge.parkingmanagerDemo.sorteo.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SorteoRepository extends CrudRepository<Sorteo,Long> {
    
}

