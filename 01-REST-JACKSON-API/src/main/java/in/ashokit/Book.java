package in.ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Book {

	private Integer bookID;
	private String bookName;
	private Double bookPrice;

	private AuthorDetails aDetails;

	public Book(Integer bookID, String bookName, Double bookPrice, AuthorDetails aDetails) {
		super();
		this.bookID = bookID;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.aDetails = aDetails;
	}

	public Integer getBookID() {
		return bookID;
	}

	public void setBookID(Integer bookID) {
		this.bookID = bookID;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public AuthorDetails getaDetails() {
		return aDetails;
	}

	public void setaDetails(AuthorDetails aDetails) {
		this.aDetails = aDetails;
	}

	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", aDetails="
				+ aDetails + "]";
	}

}
