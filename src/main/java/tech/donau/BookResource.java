package tech.donau;

import tech.donau.data.Book;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/books")
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {

    @GET
    public List<Book> getBooks() {
        return Book.listAll();
    }

    @POST
    public Book addBook(Book book) {
        book.persistOrUpdate();
        return book;
    }

}