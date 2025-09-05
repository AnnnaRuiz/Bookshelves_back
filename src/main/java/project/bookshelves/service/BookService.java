package project.bookshelves.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import project.bookshelves.DTO.BookDTO;
import project.bookshelves.exception.BookNotFoundException;
import project.bookshelves.model.Book;
import project.bookshelves.repository.BookRepository;


@Service
public class BookService {

	private final BookRepository bookRepository;
	
	@Autowired
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public Book addBook(Book book) {
		book.setBookCode(UUID.randomUUID().toString());
	
		return bookRepository.save(book);
	}
	
	public Page<BookDTO> findAllBooks(Pageable pageable) {
		return bookRepository.findAllBooksDto(pageable);
	}
	
	public Book updateBook(Book book) {
		return bookRepository.save(book);
	}
	
	public Book findBookById(Long id) {
		return bookRepository.findBookById(id)
				.orElseThrow(() -> new BookNotFoundException("Book by id " + id + " was not found"));
	}
	
	public void deleteBook(Long id) {
		bookRepository.deleteBookById(id);
	}
}
