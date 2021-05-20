package book.io.controller.entity;

import javax.persistence.*;


@Entity
@Table(name="details_book")
public class DetailsBook {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="image")
	private String image;
	@Column(name="rating")
	private int rating;
	@Column(name="price")
	private float price;
	@Column(name="synthesis")
	private String synthesis;
	
	@OneToOne(mappedBy="detailsBook", cascade=CascadeType.ALL)
	private Book  book;

	public DetailsBook() {}

	public DetailsBook(String image, int rating, float price, String synthesis) {
		this.image = image;
		this.rating = rating;
		this.price = price;
		this.synthesis = synthesis;
	}

	@Override
	public String toString() {
		return "DetailsBook [id=" + id + ", image=" + image + ", rating=" + rating + ", price=" + price + ", synthesis="
				+ synthesis + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getSynthesis() {
		return synthesis;
	}

	public void setSynthesis(String synthesis) {
		this.synthesis = synthesis;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

}
