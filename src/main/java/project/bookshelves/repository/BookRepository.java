package project.bookshelves.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import project.bookshelves.model.Book;
import project.bookshelves.DTO.BookDTO;

public interface BookRepository extends JpaRepository<Book, Long>{

	void deleteBookById(Long id);

	Optional<Book> findBookById(Long id);
	
	@Query("SELECT new project.bookshelves.DTO.BookDTO(b.id, b.title, b.author, b.imageUrl) FROM Book b")
	Page<BookDTO> findAllBooksDto(Pageable pageable);

}
