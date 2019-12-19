package me.itzg.somelib.repositories;

import me.itzg.somelib.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {

}
