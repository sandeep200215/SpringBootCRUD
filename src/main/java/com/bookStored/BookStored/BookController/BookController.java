package com.bookStored.BookStored.BookController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bookStored.BookStored.BookRepo.BookRepo;
import com.bookStored.BookStored.BookRepo.MybookRepo;
import com.bookStored.BookStored.bookentity.Book;
import com.bookStored.BookStored.bookentity.MyBook;

//@CrossOrigin(origins="*")
@RestController
@RequestMapping("/base")
public class BookController {
	@Autowired
	private BookRepo brp;
	@Autowired
	private MybookRepo mb;
	@PostMapping("/post")
	public Book addBook(@RequestBody Book book)
	{
	    return brp.save(book);	
	}
	@GetMapping("/getAll")
	public List<Book> getAll()
	{
		
		return brp.findAll(); 
	}
   
	@PostMapping("/mybook/{id}")
	public MyBook addMyBook(@PathVariable int id)
	{
	    Book bk=brp.findById(id).get();
	    MyBook mybook=new MyBook(bk.getId(),bk.getBookname(),bk.getAuthorname(),bk.getPrice());
	    return mb.save(mybook);
	}
//    @PostMapping("/update/{id}")
//    public Book update(@PathVariable("id") int id,@RequestBody Book b)
//    {
//    	Book bk=brp.findById(id).get();
//    	  // brp.save(bk);
//    	return bk;
//    }
//	@CrossOrigin(origins="*")
    @PostMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id)
    {
    	brp.deleteById(id);
    	return "Deleted";
    }
    @GetMapping("/getMyBook")
    public List<MyBook>getMyBook()
    {
    	return mb.findAll();
    }
	
	

	

}
