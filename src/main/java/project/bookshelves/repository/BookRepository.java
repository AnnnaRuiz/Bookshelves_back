package project.bookshelves.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import project.bookshelves.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

	void deleteBookById(Long id);

	Optional<Book> findBookById(Long id);

}
