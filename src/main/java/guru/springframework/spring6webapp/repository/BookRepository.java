package guru.springframework.spring6webapp.repository;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring6webapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long>{
    
}
