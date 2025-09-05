package project.bookshelves.DTO;

public class BookDTO {
	
	private Long id;
    private String title;
    private String author;
    private String imageUrl;

    public BookDTO(Long id, String title, String author, String imageUrl) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.imageUrl = imageUrl;
    }

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getImageUrl() {
		return imageUrl;
	}

}
