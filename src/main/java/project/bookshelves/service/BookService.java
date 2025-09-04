package project.bookshelves.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	public List<Book> findAllBooks() {
		return bookRepository.findAll();
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
