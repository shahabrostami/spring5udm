package srostami.test.spring5.repositories;

import org.springframework.data.repository.CrudRepository;

import srostami.test.spring5.model.Author;
import srostami.test.spring5.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
