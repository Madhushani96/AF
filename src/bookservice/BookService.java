package bookservice;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.research.ws.wadl.Response;

@Path("/books")
public class BookService {
	List<Book> books;
	//List<Book> book1;
	public BookService() {
		books = Books.getBooks();
		
		
		//book1 = Books.addBooks(id,name,price);
		
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Book> getBooks() {
		return books;
	}
	@Path("{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Book getBook(@PathParam("id") int id) {
		  for(Book b : books) {
			  if ( b.getId() == id)
				   return b;
		  }
		  // book with the given id is not found, so throw 404 error
		  throw new NotFoundException(); 
		  
	}
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	@POST
	//@Consumes(MediaType.APPLICATION_JSON)
	public List<Book> addBooks(@FormParam("aid") int id,@FormParam("aname") String name,@FormParam("aprice") int price){
	//	List<Book> booklist=Books.getBooks();
		//for(Book b1 : books) {
		//	  if ( b1.getId()!= id)
		Books.addBooks( name, price);
	//	return booklist;
		
	//}
		return books;
	}
	
	@Path("/remove/{id}")
	@DELETE
	public void deleteBooks(@PathParam("delid") int id){
		Books.deleteBooks(id);

	}
	 
}
