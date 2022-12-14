package in.ashokit.rest;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Book;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;

@RestController
public class BookRest {

	@ApiOperation(value = "This methods is to take book data and save to DB",response = String.class)
	@ApiResponse(message = "Get plaiin text", code = 1)
	@PostMapping(value = "/book/{book}", consumes = {"application/json"},produces = {"text/plain"})
	public String getBook(@ApiParam("Book Details") @RequestBody Book book) {
		System.out.println(book);
		return "sucess";
	}
}
