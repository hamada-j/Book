package book.io.controller.entity;

import javax.persistence.*;


@Entity
@Table(name="book")
public class Book {	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="title")
	private String title;
	@Column(name="genre")
	private String genre;
	@Column(name="year")
	private int year;

	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id", nullable = false)
	private DetailsBook detailsBook;
	
	@ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.REFRESH, CascadeType.MERGE, CascadeType.DETACH})
	@JoinColumn(name="author_id")
	private Author author;

	public Book() {}

	public Book(String title, String genre, int year) {
		this.title = title;
		this.genre = genre;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", genre=" + genre + ", year=" + year + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public DetailsBook getDetailsBook() {
		return detailsBook;
	}

	public void setDetailsBook(DetailsBook detailsBook) {
		this.detailsBook = detailsBook;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	
	
	
	
	

}
