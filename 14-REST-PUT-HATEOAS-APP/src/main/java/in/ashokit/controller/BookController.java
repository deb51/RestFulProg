package in.ashokit.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Book;

@RestController
public class BookController {
	
	@GetMapping(value = "/book/{isbn}",produces="application/json")
	public Book getBookInfo(@PathVariable String isbn) {
		
		Book book = new Book(isbn, "Spring", 200.00, "Debasish");
		Link withRel = WebMvcLinkBuilder.linkTo(
				WebMvcLinkBuilder.methodOn(BookController.class).
				getAllBooks()).withRel("All-Book");
		
		book.add(withRel);
		return book;
		
	}
	

	@GetMapping(value = "/books", produces= "application/json")
	public List<Book> getAllBooks() {

		Book b1 = new Book("ISBN01", "Spring", 200.00, "Debasish");
		Book b2 = new Book("ISBN02", "Hibernate", 300.00, "DEV");
		Book b3 = new Book("ISBN03", "Core Java", 400.00, "Bahubali");
		List<Book> book = new ArrayList<>();
		
		book.add(b1);
		book.add(b2);
		book.add(b3);
		
		return book;
	}
}
