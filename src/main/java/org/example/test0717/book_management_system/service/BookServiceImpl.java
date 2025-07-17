package org.example.test0717.book_management_system.service;

import org.example.test0717.book_management_system.exception.BookNotFoundException;
import org.example.test0717.book_management_system.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService{
    private final List<Book> bookList = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        bookList.add(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return new ArrayList<>(bookList);
    }

    @Override
    public Book getBookById(int id) {
        for (Book book: bookList) {
            if (book.getId() == id) {
                return book;
            }
        }
        throw new BookNotFoundException( id + "의 책을 찾을 수 없습니다.");
    }

    @Override
    public void updateBookAuthor(int id, String newAuthor) {
        Book book = getBookById(id);
        book.setAuthor(newAuthor);
    }

    @Override
    public void deleteBook(int id) {
        Book bookToDelete = null;

        for (Book book: bookList) {
            if (book.getId() == id) {
                bookToDelete = book;
                break;
            }
        }

        if (bookToDelete == null) {
            throw new BookNotFoundException( id + "의 책을 찾을 수 없습니다.");
        }

        bookList.remove(bookToDelete);
    }

    @Override
    public List<Book> findBookByTitle(String title) {
        List<Book> result = new ArrayList<>();

        for (Book book: bookList) {
            if (book.getTitle().equals(title)) {
                result.add(book);
            }
        }

        return result;
    }
}
