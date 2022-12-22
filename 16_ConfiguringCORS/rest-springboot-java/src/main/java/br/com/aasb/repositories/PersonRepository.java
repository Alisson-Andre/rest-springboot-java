package br.com.aasb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.aasb.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
