package org.example.test0717.book_management_system.service;

import org.example.test0717.book_management_system.model.Book;

import java.util.List;

public interface BookService {
    void addBook(Book book);

    List<Book> getAllBooks();

    Book getBookById(int id);

    void updateBookAuthor(int id, String newAuthor);

    void deleteBook(int id);

    List<Book> findBookByTitle(String title);
}
