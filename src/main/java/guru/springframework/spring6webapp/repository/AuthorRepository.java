package guru.springframework.spring6webapp.repository;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring6webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{
    
}
