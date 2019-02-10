package srostami.test.spring5.repositories;

import org.springframework.data.repository.CrudRepository;

import srostami.test.spring5.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
