package srostami.test.spring5.repositories;

import org.springframework.data.repository.CrudRepository;

import srostami.test.spring5.model.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
