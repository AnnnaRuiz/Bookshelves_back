package project.bookshelves.model;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
public class Book implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable= false, updatable = false)
	private Long id;
	private String name;
	@Column(length = 500)
	private String description;
	private int pages;
	private String author;
	private String category;
	private String imageUrl;
	@Column (nullable=false, updatable=false)
	private String bookCode;
	
	protected Book() {
    }
	
	public Book(String name, String description, int pages, String author, String category, String imageUrl) {
		this.name = name;
		this.description = description;
		this.pages = pages;
		this.author = author;
		this.category = category;
		this.imageUrl = imageUrl;
	}

	public String getBookCode() {
		return bookCode;
	}

	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Long getId() {
		return id;
	}
	
	

}
