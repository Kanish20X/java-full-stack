package com.satya.springbootrest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlienDb extends CrudRepository<Alien,Integer> {
}
