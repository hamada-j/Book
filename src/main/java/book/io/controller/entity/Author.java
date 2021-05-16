package book.io.controller.entity;

import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="author")
public class Author {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="bio")
	private String bio;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="author", cascade= {CascadeType.PERSIST,CascadeType.REFRESH, CascadeType.MERGE, CascadeType.DETACH})
	private List<Book> books;

	public Author() {}

	public Author(String name, String bio) {
		this.name = name;
		this.bio = bio;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", bio=" + bio + ", books=" + books + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

}
