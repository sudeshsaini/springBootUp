package com.fremily.famTree.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fremily.famTree.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

}
