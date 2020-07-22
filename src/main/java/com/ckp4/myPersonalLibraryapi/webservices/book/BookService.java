package com.ckp4.myPersonalLibraryapi.webservices.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository repository;

    public List<Book> getAll() {
        return repository.findAll();
    }

    public Book getBookById(Long id){
        return repository.findById(id).get();
    }

    public Book createBook(Book book){
        return repository.save(book);
    }

    public Book updateBook(Long id, Book book){
        Book bookToUpdate = repository.findById(id).get();
        bookToUpdate.setTitle(book.getTitle());
        bookToUpdate.setRating(book.getRating());
        bookToUpdate.setImg(book.getImg());
        bookToUpdate.setReadingDate(book.getReadingDate());
        bookToUpdate.setSummary(book.getSummary());
        bookToUpdate.setPersonalSummary(book.getPersonalSummary());
        return repository.save(bookToUpdate);
    }

    public void deleteBook(Long id){
        repository.deleteById(id);
    }
}
