package com.ckp4.myPersonalLibraryapi.webservices.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@CrossOrigin
public class BookController {

    @Autowired
    BookService service;

    @GetMapping()
    public List<Book> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id){
        return service.getBookById(id);
    }

    @PostMapping()
    public Book createBook(@RequestBody Book book){
        return service.createBook(book);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book){
        return service.updateBook(id, book);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        service.deleteBook(id);
    }

}

