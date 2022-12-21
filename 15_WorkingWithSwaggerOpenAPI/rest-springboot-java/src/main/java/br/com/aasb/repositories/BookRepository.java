package br.com.aasb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.aasb.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
